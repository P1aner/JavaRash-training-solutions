package com.javarush.task.task06.task0620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Исправляем ошибки юности
*/

public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String maxim = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max = a > b ? a : b;

        System.out.println(maxim + max);
    }

}
/*
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "The max is 25".
 */


/*
public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max = a > b ? a : b;

        System.out.println(max + max);
    }

}
 */
/*
5
25
The max is 25

Process finished with exit code 0
 */