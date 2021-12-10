package com.javarush.task.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя 1:");
        String name1 = reader.readLine();
        System.out.println("Введите имя 2:");
        String name2 = reader.readLine();

        System.out.println("Введите имя 3:");
        String name3 = reader.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");

    }
}


/*Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!

 */

/*Введите имя 1:
Вася1
Введите имя 2:
Вася2
Введите имя 3:
Вася3
Вася1 + Вася2 + Вася3 = Чистая любовь, да-да!

Process finished with exit code 0

 */


