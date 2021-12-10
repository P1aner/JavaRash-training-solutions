package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Введите имя:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Количество лет:");

        String age = reader.readLine();


        // System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
        System.out.printf("%s захватит мир через %s лет. Му-ха-ха!", name, age);
    }
}

/*Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

/* Введите имя:
Вася
Количество лет:
12
Вася захватит мир через 12 лет. Му-ха-ха!

Process finished with exit code 0 */