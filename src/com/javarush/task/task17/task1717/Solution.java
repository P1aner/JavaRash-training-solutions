package com.javarush.task.task17.task1717;

/*
Лишняя синхронизация
*/

/**
 * Несколько раз запусти программу и каждый раз обрати внимание на вывод - информация по каждому человеку отображается одним блоком, без перемешивания. Так как synchronized существенно замедляет программу (на нашей маленькой программе это, скорее всего, заметно не будет), то попробуй как будет работать программа без synchronized - удали все synchronized и посмотри на вывод.
 * Твоя задача: удалить лишние synchronized, но так, чтобы вывод информации по каждому человеку отображался одним блоком.
 */
public class Solution {
    public static void main(String[] args) {
        Thread myThread1 = new Thread(new MyRunnable("Коля", 35));
        Thread myThread2 = new Thread(new MyRunnable("Лена", 21));
        Thread myThread3 = new Thread(new MyRunnable("Ваня", 19));
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }

    public static synchronized void printInfo(String name, int age) {
        for (int i = 1; i <= 5; i++) {

                System.out.print(i);
                System.out.print(".");
                System.out.print(" ");
                System.out.print("Меня");
                System.out.print(" ");
                System.out.print("зовут");
                System.out.print(" ");
                System.out.print(name);
                System.out.print(",");
                System.out.print(" ");
                System.out.print("мне");
                System.out.print(" ");
                System.out.print(age);
                System.out.println();

        }
    }

    public static class MyRunnable implements Runnable {
        private final String name;
        private final int age;

        public MyRunnable(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public void run() {
            printInfo(name, age);
        }
    }
}
/*
1. Меня зовут Коля, мне 35
2. Меня зовут Коля, мне 35
3. Меня зовут Коля, мне 35
4. Меня зовут Коля, мне 35
5. Меня зовут Коля, мне 35
1. Меня зовут Ваня, мне 19
2. Меня зовут Ваня, мне 19
3. Меня зовут Ваня, мне 19
4. Меня зовут Ваня, мне 19
5. Меня зовут Ваня, мне 19
1. Меня зовут Лена, мне 21
2. Меня зовут Лена, мне 21
3. Меня зовут Лена, мне 21
4. Меня зовут Лена, мне 21
5. Меня зовут Лена, мне 21

Process finished with exit code 0
 */