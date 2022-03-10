package com.javarush.task.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/*
Аптека
*/

/**
 * Реализуй интерфейс Runnable в классах Apteka и Person.
 * Все нити должны работать пока не isStopped.
 * Логика для Apteka: drugsController должен сделать продажу (вызвать метод void sell(Drug drug, int count)) случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 300 мс.
 * Логика для Person: drugsController должен сделать покупку (вызвать метод void buy(Drug drug, int count)) случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 100 мс.
 * Расставь synchronized там, где это необходимо.
 */

public class Solution {
    public static DrugsController drugsController = new DrugsController();
    public static boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Thread apteka = new Thread(new Apteka(), "Apteka");
        Thread man = new Thread(new Person(), "Мужчина");
        Thread woman = new Thread(new Person(), "Женщина");

        apteka.start();
        man.start();
        woman.start();

        Thread.sleep(1000);
        isStopped = true;
    }

    public static class Apteka implements Runnable {

        @Override
        public void run() {
            while (!isStopped) {
                drugsController.sell(getRandomDrug(), getRandomCount());
                waitAMoment();
                waitAMoment();
                waitAMoment();
            }
        }
    }

    public static class Person implements Runnable {

        @Override
        public void run() {
            while (!isStopped) {
                drugsController.buy(getRandomDrug(), getRandomCount());
                waitAMoment();
            }

        }
    }

    public static int getRandomCount() {
        return (int) (Math.random() * 3) + 1;
    }

    public static Drug getRandomDrug() {
        int index = (int) ((Math.random() * 1000) % (DrugsController.allDrugs.size()));
        List<Drug> drugs = new ArrayList<>(DrugsController.allDrugs.keySet());
        return drugs.get(index);
    }

    private static void waitAMoment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
/*
Мужчина купил(а) Анальгин 2 шт. Осталось - 16
Женщина хочет Плацебо 2 шт. В наличии - 1
Apteka Закупка Плацебо 3
Мужчина купил(а) Анальгин 3 шт. Осталось - 13
Женщина купил(а) Плацебо 2 шт. Осталось - 2
Женщина хочет Плацебо 3 шт. В наличии - 2
Мужчина хочет Плацебо 3 шт. В наличии - 2
Женщина купил(а) Анальгин 3 шт. Осталось - 10
Мужчина купил(а) Плацебо 2 шт. Осталось - 0
Apteka Закупка Анальгин 2
Мужчина купил(а) Панадол 2 шт. Осталось - 3
Женщина хочет Плацебо 2 шт. В наличии - 0
Мужчина купил(а) Анальгин 1 шт. Осталось - 11
Женщина купил(а) Анальгин 2 шт. Осталось - 9
Женщина купил(а) Анальгин 3 шт. Осталось - 6
Мужчина купил(а) Панадол 3 шт. Осталось - 0
Apteka Закупка Панадол 1
Мужчина купил(а) Анальгин 3 шт. Осталось - 3
Женщина хочет Панадол 3 шт. В наличии - 1
Мужчина купил(а) Панадол 1 шт. Осталось - 0
Женщина хочет Панадол 2 шт. В наличии - 0
Женщина хочет Панадол 2 шт. В наличии - 0
Мужчина хочет Панадол 1 шт. В наличии - 0
Apteka Закупка Плацебо 3

Process finished with exit code 0

 */