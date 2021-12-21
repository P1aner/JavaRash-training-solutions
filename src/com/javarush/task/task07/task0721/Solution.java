package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //напишите тут ваш код
        int[] numbers;
        numbers = getInst();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код


    public static int[] getInst() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        return numbers;
    }
}


/*
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
 */


/*
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
20 1
Process finished with exit code 0
 */



