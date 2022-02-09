package com.javarush.task.task16.task1604;

/*
Вывод стек-трейса
*/

/**
 * 1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
 * 2. SpecialThread должен выводить в консоль свой стек-трейс.
 *
 * Подсказка: main thread уже выводит в консоль свой стек-трейс.
 */

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }
    public static class SpecialThread implements Runnable {

        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
/*
*****************
java.base/java.lang.Thread.getStackTrace(Thread.java:1602)
com.javarush.task.task16.task1604.Solution.main(Solution.java:21)
java.base/java.lang.Thread.getStackTrace(Thread.java:1602)
com.javarush.task.task16.task1604.Solution$SpecialThread.run(Solution.java:29)
java.base/java.lang.Thread.run(Thread.java:829)

Process finished with exit code 0
 */
