package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("ВВедите три числа:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[3];
        int n = 0;
        for (int i = 0; i < 3; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        if (array[0] == array[1]) {
            n = 3;
        }
        if (array[0] == array[2]) {
            n = 2;
        }
        if (array[1] == array[2]) {
            n = 1;
        }
        System.out.println(n);
    }
}

/*Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3

 */
/*ВВедите три числа:
1
1
2
3

Process finished with exit code 0

 */