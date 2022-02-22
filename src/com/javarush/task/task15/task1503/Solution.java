package com.javarush.task.task15.task1503;

/*
ООП - машинки
*/

/**
 * Оцени наши машины и определи их в подходящую категорию — роскошное или дешевое авто — и выведи результат.
 * Для вывода используй только переменные из класса Constants.
 * В классе Ferrari реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
 * В классе Lanos реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
 * Создай public static класс LuxuriousCar (РоскошнаяМашина).
 * Создай public static класс CheapCar (ДешеваяМашина).
 * Унаследуй Ferrari и Lanos от CheapCar и LuxuriousCar, подумай, какой класс для кого.
 * В классе LuxuriousCar реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
 * В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
 * В классах LuxuriousCar и CheapCar для метода printlnDesire расставь различными способами модификаторы доступа так, чтобы в классах Ferrari и Lanos выполнялось расширение видимости.
 */

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);

        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }

    public static class LuxuriousCar {
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }

    public static class CheapCar {
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }

    }


}
/*
Я хочу ездить на роскошной машине
Я хочу ездить на дешевой машине
Я хочу ездить на Феррари
Я хочу ездить на Ланосе

Process finished with exit code 0
 */
















