package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("ВВедите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = (n + "").length();
        String parity = "";
        String even = "Четное";
        String odd = "Нечетное";
        String[] myArray = new String[]{"однозначное", "двузначное", "трехзначное",
                "четырехзначное", "пятизначное", "щестизначное",
                "семизначное", "восьмизначное", "девятизначное",
                "десятизначное", "одинадцатизначное"};
        if (n == 0) {
            System.out.println("ноль");
        } else {
            if (n % 2 == 0) {
                parity = even;
            } else {
                parity = odd;
            }
            if (n < 0) {
                k = k - 1;

            }


        }
        System.out.printf("%s %s число", parity, myArray[k - 1]);
    }

}





/*Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

Пример для числа 100:
четное трехзначное число

Пример для числа 51:
нечетное двузначное число

 */
/*
ВВедите число:
-100
четное трехзначное число
Process finished with exit code 0
 */