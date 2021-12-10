package com.javarush.task.task01.task0132;

/*
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int e = number % 10;
        int d = number % 100 / 10;
        int s = number % 1000 / 100;
        return e + d + s;
    }
}


/*Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15

 */

/*
15

Process finished with exit code 0

 */
