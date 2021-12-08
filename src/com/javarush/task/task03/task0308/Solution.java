package com.javarush.task.task03.task0308;

/*
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(getFactorial(10));
    }

    public static int getFactorial(int s) {
        int result = 1;
        for (int i = 1; i <= s; i++) {
            result = result * i;

        }
        return result;
    }
}

/*Вывести на экран произведение 10 чисел от 1 до 10.
Результат - это 1 число.

Подсказка:
будет три миллиона с хвостиком.

 */