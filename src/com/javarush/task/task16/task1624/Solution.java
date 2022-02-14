package com.javarush.task.task16.task1624;

/*
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
*/

/**
 * 1. Разберись, что делает программа.
 * 2. Сделай так, чтоб программа сначала выводила результат нити, а когда нить завершится - продолжила метод main.
 *
 * 3. Пример выходных данных:
 * inside MyThread 0
 * inside MyThread 1
 * ...
 * inside MyThread 9
 * inside main 0
 * inside main 1
 * ...
 * inside main 9
 */

public class Solution {
    public static MyThread t = new MyThread();
    static String message = "inside main ";

    public static void main(String a[]) throws Exception {
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }

    }

    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    static class MyThread extends Thread {
        String message = "inside MyThread ";

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                Solution.sleep();
            }
        }
    }
}
/*
inside MyThread 0
inside MyThread 1
inside MyThread 2
inside MyThread 3
inside MyThread 4
inside MyThread 5
inside MyThread 6
inside MyThread 7
inside MyThread 8
inside MyThread 9
inside main 0
inside main 1
inside main 2
inside main 3
inside main 4
inside main 5
inside main 6
inside main 7
inside main 8
inside main 9

Process finished with exit code 0
 */
