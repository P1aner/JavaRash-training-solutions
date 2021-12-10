package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Имя:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println("Число 1:");

        String cost = reader.readLine();
        System.out.println("Число 2:");

        String age = reader.readLine();
        System.out.println(name + " получает " + cost + " через " + age + " лет.");
    }
}


/* Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.

 */

/* Имя:
Вася
Число 1:
3000
Число 2:
5
Вася получает 3000 через 5 лет.

Process finished with exit code 0
 */

