package com.javarush.task.task15.task1530;

/*
Template pattern
*/

/**
 * В этой задаче тебе нужно:
 * В отдельном файле создать класс DrinkMaker с тремя абстрактными методами:
 * void getRightCup() - выбрать подходящую чашку;
 * void putIngredient() - положить ингредиенты;
 * void pour() - залить жидкость.
 * В классе DrinkMaker создать и реализовать метод void makeDrink(), который готовит напиток в такой последовательности: выбирает чашку, кладет ингредиенты, заливает жидкость.
 * В отдельных файлах создать классы LatteMaker и TeaMaker, которые наследуются от DrinkMaker.
 * Распределить следующие фразы между всеми методами в классах LatteMaker и TeaMaker:
 * "Заливаем кипятком"
 * "Берем чашку для латте"
 * "Насыпаем чай"
 * "Берем чашку для чая"
 * "Заливаем кофе"
 * "Делаем молоко с пенкой"
 * Каждый метод должен выводить в консоль свою фразу, не пересекаясь с другими методами.
 */

public class Solution {
    public static void main(String[] args) {
        LatteMaker latte = new LatteMaker();
        latte.makeDrink();
        TeaMaker tea = new TeaMaker();
        tea.makeDrink();
    }
}
/*
Берем чашку для латте
Делаем молоко с пенкой
Заливаем кофе
Берем чашку для чая
Насыпаем чай
Заливаем кипятком

Process finished with exit code 0
 */


