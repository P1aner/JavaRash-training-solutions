package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("ВВедите три числа");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < 3; i++)
            if (Integer.parseInt(reader.readLine()) > 0) {
                positive++;
            } else {
                negative++;
            }


        System.out.println("количество отрицательных чисел " + negative);
        System.out.println("количество положительных чисел " + positive);


    }
}

/*Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Пример:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример:
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1

 */


/* ВВедите три числа
1
2
-1
количество отрицательных чисел 1
количество положительных чисел 2

Process finished with exit code 0


 */