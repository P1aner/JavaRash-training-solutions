package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        amountOfEven(n);
        amountOfOdd(n);
        System.out.println(n);
        System.out.println("Even: " + even + " Odd: " + odd);


    }

    public static void amountOfEven(int n) {
        int number = n;
        while (0 < number) {
            int remainder = number % 10;
            if (remainder == 0) {  //проверка на 0. он не четный и не нечетный
                number = number / 10;
            } else {
                if (remainder % 2 == 0) {
                    even++;
                }
                number = number / 10;
            }

        }
    }

    public static void amountOfOdd(int n) {
        int number = n;
        while (0 < number) {
            int remainder = number % 10;

            if (remainder % 2 != 0) {
                odd++;
            }
            number = number / 10;
        }

    }


}


/*
Ввести с клавиатуры положительное число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1
 */

/*
59620
59620
Even: 2 Odd: 2

Process finished with exit code 0
 */