package com.javarush.task.task12.task1215;

/*
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {

        @Override
        public String getName() {
            return null;
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }

}
/*
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
 */
/*

Process finished with exit code 0
 */