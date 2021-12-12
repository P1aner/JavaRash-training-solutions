package com.javarush.task.task04.task0409;

/*
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        System.out.printf("Из чисел %s и %s ", a, b);
        if (abs(a - 10) >= abs(b - 10)) {

            System.out.printf("число %s ближе к десяти\n" ,b);
        } else {
            System.out.printf("число %s ближе к десяти\n", a);
        }


    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}

/*Напиши метод displayClosestToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.

Подсказка:
используй метод public static int abs(int a), который возвращает абсолютную величину числа.

 */

/*Из чисел 8 и 11 число 11 ближе к десяти
Из чисел 7 и 14 число 7 ближе к десяти

Process finished with exit code 0*/