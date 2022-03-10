package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
Факториал
*/

/**
 * Напиши метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа, включая его.
 * <p>
 * Пример вычислений: 4! = factorial(4) = 1*2*3*4
 * Пример вывода: 24
 * <p>
 * Для этого:
 * Введи с консоли число меньше либо равно 150.
 * Реализуй функцию factorial.
 * Если введенное число меньше 0, выведи 0.
 * 0! = 1
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        BigInteger bd = new BigInteger("1");
        if (n < 0) {
            bd = new BigInteger("0");
        } else {
            for (int i = 1; i <= n; i++) {
                bd = bd.multiply(new BigInteger(String.valueOf(i)));
            }

        }

        return bd.toString();
    }
}
/*
120
6689502913449127057588118054090372586752746333138029810295671352301633557244962989366874165271984981308157637893214090552534408589408121859898481114389650005964960521256960000000000000000000000000000

Process finished with exit code 0

 */

