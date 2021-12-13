package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите целое число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String parity;
        String even = "четное";
        String odd = "нечетное";

        String sign;
        String plus = "Положительное";
        String minus = "Отрицательное";


        if (n == 0) {
            System.out.println("Ноль");
        } else {
            if (n % 2 == 0) {
                parity = even;
            } else {
                parity = odd;
            }
            if (n > 0) {
                sign = plus;


            } else {
                sign = minus;
            }
            System.out.printf("%s %s число", sign, parity);


            //напишите тут ваш код

        }
    }
}




/* Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
"отрицательное четное число" - если число отрицательное и четное,
"отрицательное нечетное число" - если число отрицательное и нечетное,
"ноль" - если число равно 0,
"положительное четное число" - если число положительное и четное,
"положительное нечетное число" - если число положительное и нечетное.

Пример для числа 100:
положительное четное число

Пример для числа -51:
отрицательное нечетное число

 */
/* Введите целое число:
20
положительное четное число
Process finished with exit code 0


 */