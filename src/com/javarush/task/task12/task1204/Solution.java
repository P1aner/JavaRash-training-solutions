package com.javarush.task.task12.task1204;

/*
То ли птица, то ли лампа
*/

public class Solution {

    public static final String DOG = "Собака";
    public static final String BIRD = "Птица";
    public static final String LAMP = "Лампа";
    public static final String CAT = "Кот";

    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение

        if (o instanceof Cat) {
            System.out.println(CAT);
        }
        if (o instanceof Dog) {
            System.out.println(DOG);
        }
        if (o instanceof Bird) {
            System.out.println(BIRD);
        }
        if (o instanceof Lamp) {
            System.out.println(LAMP);
        }


    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
/*
Напиши метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 */
/*
Кот
Птица
Лампа
Кот
Собака

Process finished with exit code 0
 */
