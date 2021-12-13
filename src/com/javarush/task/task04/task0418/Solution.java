package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Введите два числа:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        if (number2 >= number1) {
            number2 = number1;
        }

        System.out.println(number2);

    }
}

/* Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.

 */