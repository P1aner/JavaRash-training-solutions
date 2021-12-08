package com.javarush.task.task03.task0305;

/*
Я так давно родился
*/

import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        java.util.Calendar calendar = new GregorianCalendar(1993, 6, 13);
        System.out.println(calendar.getTime());
        //    System.out.println("JUL 13 1993");
    }
}


/*Вывести на экран дату своего рождения в виде:
MAY 1 2012
*/
