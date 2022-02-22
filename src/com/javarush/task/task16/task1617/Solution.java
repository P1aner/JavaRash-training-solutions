package com.javarush.task.task16.task1617;

/*
Отсчет на гонках
*/

/**
 * 1. Разберись, что делает программа.
 * 2. Реализуй логику метода run так, чтобы каждую секунду через пробел
 * выдавался отсчет начиная с numSeconds до 1, а потом слово [Марш!] (см примеры).
 * 3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
 * <p>
 * Пример для numSeconds=4 :
 * "4 3 2 1 Прервано!"
 * <p>
 * 4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
 * Пример для numSeconds=3 :
 * "3 2 1 Марш!"
 * <p>
 * PS: метод sleep выбрасывает InterruptedException.
 */

public class Solution {
    public static volatile int numSeconds = 5;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            while (!currentThread().isInterrupted()) {
                if (numSeconds > 0) {
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                } else {
                    System.out.print("Марш!");
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.print("Прервано!");
                    break;
                }
            }

        }
    }
}
/*
5 4 3 2 Прервано!
Process finished with exit code 0
 */

