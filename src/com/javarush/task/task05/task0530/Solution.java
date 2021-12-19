package com.javarush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}


/*
Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.
 */
/*
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = reader.readLine();
        int b = reader.read();

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
 */
/*
5
6
Sum = 11

Process finished with exit code 0
 */