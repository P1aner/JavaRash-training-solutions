package com.javarush.task.task03.task0320;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Скромность украшает программиста
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Введите имя:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");

    }
}




/*Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!

Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!

 */

/* Введите имя:
Вася
Вася зарабатывает $5,000. Ха-ха-ха!

Process finished with exit code 0


 */