package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/*
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Введите номер дня недели:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = parseInt(reader.readLine());
        // dayOfMonth(day);
        if (day < 1 || day > 7) {
            System.out.println("Такого дня не существует");
        } else {
            String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
            System.out.println(days[day - 1]);
        }

    }


    //этот метод городил я
   /* public static void dayOfMonth(int day) {
        if (day == 1) System.out.println("Понедельник");
        if (day == 2) System.out.println("Вторник");
        if (day == 3) System.out.println("Среда");
        if (day == 4) System.out.println("Четверг");
        if (day == 5) System.out.println("Пятница");
        if (day == 6) System.out.println("Суббота");
        if (day == 7) System.out.println("Воскресенье");
        if (day < 1 || day > 7) System.out.println("такого дня не существует");
    }*/
}



/*Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

 */
/*Введите номер дня недели:
10
такого дня не существует

Process finished with exit code 0

 */