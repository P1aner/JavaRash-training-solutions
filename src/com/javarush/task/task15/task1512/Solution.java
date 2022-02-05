package com.javarush.task.task15.task1512;

/*
Максимально простой код-2
*/

/**
 * Упрости код — удали все конструкторы и вызовы конструкторов суперклассов, которые автоматически добавятся при компиляции.
 *
 * Взаимосвязь между объектами классов NakedCat и NormalCat, SiamCat — Is-a: http://en.wikipedia.org/wiki/Is-a
 */

public class Solution {
    public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }

    public static class NakedCat {
    }

    public static class NormalCat extends NakedCat {

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NormalCat() {

        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}
/*
My name is Simka

Process finished with exit code 0
 */
