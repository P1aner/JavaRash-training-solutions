package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Только по-очереди!
*/

/**
 * 1. В классе Solution создать public static класс нити Read3Strings унаследовавшись от Thread.
 * 2. В методе run реализовать чтение с консоли трех строк.
 * 3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
 * 4. В методе main вывести результат для каждой нити.
 * 5. Используй join.
 * <p>
 * Пример:
 * <p>
 * Входные данные:
 * a
 * b
 * c
 * d
 * e
 * f
 * <p>
 * Выходные данные:
 * a b c
 * d e f
 */

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        String text = "";

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
                    text += reader.readLine() + " ";
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printResult() {
            System.out.println(text);
        }
    }
}
/*
a
b
c
d
e
f
a b c
d e f

Process finished with exit code 0
 */