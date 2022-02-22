package com.javarush.task.task16.task1626;

/*
Создание по образцу
*/

/**
 * Разберись, как работает программа.
 * По образу и подобию CountdownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке - от 1 до number.
 */

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        //Add your code here - добавь код тут
        private int countIndexUp = 0;

        public void run() {
            try {
                while (true) {
                    ++countIndexUp;
                    System.out.println(toString());
                    Thread.sleep(500);
                    if (countIndexUp == Solution.number) return;

                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;

        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
/*
Увеличиваем: 1
Уменьшаем: 5
Уменьшаем: 4
Увеличиваем: 2
Увеличиваем: 3
Уменьшаем: 3
Увеличиваем: 4
Уменьшаем: 2
Уменьшаем: 1
Увеличиваем: 5

Process finished with exit code 0
 */