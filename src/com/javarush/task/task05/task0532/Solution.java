package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());

        int maximum = Integer.parseInt(reader.readLine());

        for (int i = 1; i < n; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (maximum < number) {
                maximum = number;
            }

        }
        System.out.println(maximum);
    }
}



/*
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
 */
/*
5
1
2
5
1
2
5

Process finished with exit code 0
 */