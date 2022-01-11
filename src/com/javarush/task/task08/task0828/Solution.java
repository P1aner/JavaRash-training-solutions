package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Номер месяца
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        HashMap<String, Integer> month = new HashMap<>();
        month.put("Январь", 1);
        month.put("Февраль", 2);
        month.put("Март", 3);
        month.put("Апрель", 4);
        month.put("Май", 5);
        month.put("Июнь", 6);
        month.put("Июль", 7);
        month.put("Август", 8);
        month.put("Сентябрь", 9);
        month.put("Октябрь", 10);
        month.put("Ноябрь", 11);
        month.put("Декабрь", 12);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOfMonth = null;
        try {
            nameOfMonth = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String monthArr : month.keySet()) {
            if (monthArr.equalsIgnoreCase(nameOfMonth)) {
                System.out.println(monthArr + " это " + month.get(monthArr) + " месяц.");
            }
        }

    }
}

/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.
 */

/*
февраль
Февраль это 2 месяц.

Process finished with exit code 0
 */