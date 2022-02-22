package com.javarush.task.task15.task1509;

/*
Мужчина или женщина?
*/

/**
 * Измени метод printName() так, чтобы он выполнялся для man и woman.
 * Реализация метода printName() должна быть одна.
 */

public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human human) {
        System.out.println(human.getClass());
    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
/*

Process finished with exit code 0
 */
