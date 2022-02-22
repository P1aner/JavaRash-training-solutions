package com.javarush.task.task16.task1633;

/*
Отдебажим все на свете
*/

/**
 * Разобраться, что делает программа.
 * <p>
 * Почитать про UncaughtExceptionHandler - это важно.
 * <p>
 * Еще раз внимательно посмотреть программу.
 * <p>
 * Разобраться - продебажить - почему наш OurUncaughtExceptionHandler не срабатывает.
 * <p>
 * Исправить ошибку, т.е. все должно работать. :)
 * <p>
 * Ожидаемый результат в произвольном порядке:
 * <p>
 * Нить 1: My exception message
 * <p>
 * Нить 2: My exception message
 */

public class Solution {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);

        Thread threadA = new Thread(commonThread, "Нить 1");
        Thread threadB = new Thread(commonThread, "Нить 2");
        Thread.currentThread().setUncaughtExceptionHandler(handler);
        threadA.setUncaughtExceptionHandler(handler);
        threadB.setUncaughtExceptionHandler(handler);
        threadA.start();
        threadB.start();

        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            setUncaughtExceptionHandler(handler);
            start();
        }

        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}
/*
Нить 2: My exception message
Нить 1: My exception message

Process finished with exit code 0
 */