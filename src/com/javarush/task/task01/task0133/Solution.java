package com.javarush.task.task01.task0133;

/*
Не думать о секундах…
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
       /* int secondsAfter15 = 30 * 60;
        System.out.println(secondsAfter15);
    }*/
        System.out.println("Введите время в формате hh.mm:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        double time1 = Double.parseDouble(text) * 100;

        System.out.println("Введите время 2 в формате hh.mm:");
        text = reader.readLine();
        double time2 = Double.parseDouble(text) * 100;
        int m1 = (int) time1;
        int m2 = (int) time2;
        int h1 = m1 / 100;
        int h2 = m2 / 100;
        int mm1 = m1 % 100;
        int mm2 = m2 % 100;
        mm1 = h1 * 60 + mm1;
        mm2 = h2 * 60 + mm2;
        int mm = (mm2 - mm1) * 60;

        System.out.println(mm);

    }
}


/*Напиши код, который считает сколько секунд прошло с 15:00, если на часах 15:30. Выведи результат на экран.

 */

/*1800

Process finished with exit code 0

 */
