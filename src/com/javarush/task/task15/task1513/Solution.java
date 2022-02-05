package com.javarush.task.task15.task1513;

/*
Максимально простой код-3
*/
/**
 * Упрости код:
 * убери все наследования классов, которые автоматически добавятся при компиляции;
 * убери все конструкторы, которые создаются и добавляются автоматически.
 */

public class Solution {
    public static void main(String[] args) {
    }

    public interface Runnable {

    }

    public class Machine implements Runnable {

    }

    public class Car extends Machine {

    }
}
/*

Process finished with exit code 0
 */
