package com.javarush.task.task16.task1620;

import java.util.ArrayList;
import java.util.List;

/*
Один для всех, все - для одного
*/

/**
 * 1. Разберись, как работает программа.
 * 1.1. Обрати внимание, что объект Water - один для всех нитей.
 * 2. Реализуй метод ourInterruptMethod, чтобы он прерывал все нити из threads.
 * 3. В методе run исправь значения переменных:
 * 3.1. isCurrentThreadInterrupted - должна равняться значению метода isInterrupted у текущей нити.
 * 3.2. threadName - должна равняться значению метода getName (реализовано в классе Thread) у текущей нити.
 */

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<Thread>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        //add your code here - добавь код тут
        for (int i = 0;i<threads.size();i++){
        threads.get(i).interrupt();}
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables - исправь 2 переменных
            boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            String threadName = Thread.currentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Объект " + sharedResource + ", нить " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
/*
Объект water, нить #0
Объект water, нить #2
Объект water, нить #1
Объект water, нить #1
Объект water, нить #2
Объект water, нить #0
Объект water, нить #0
Объект water, нить #2
Объект water, нить #1

Process finished with exit code 0
 */

