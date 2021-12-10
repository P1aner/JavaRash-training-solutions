package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Сколько хотите?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String money = reader.readLine();
        System.out.println("Я буду зарабатывать $" + money + " в час");

    }
}

/*Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час

 */





/*Сколько хотите?
50
Я буду зарабатывать $50 в час

Process finished with exit code 0

 */