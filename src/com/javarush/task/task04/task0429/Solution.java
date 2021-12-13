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
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int number = 0;
        int mumber = 0;
        if (n1 > 0) {
            number++;
        } else {
            mumber++;
        }
        if (n2 > 0) {
            number++;
        } else {
            mumber++;
        }
        if (n3 > 0) {
            number++;
        } else mumber++;
        System.out.println("количество отрицательных чисел " + mumber);
        System.out.println("количество положительных чисел " + number);


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