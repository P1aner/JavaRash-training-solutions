package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/*
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Введите три числа:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = parseInt(reader.readLine());
        int b = parseInt(reader.readLine());
        int c = parseInt(reader.readLine());
        if (a == b && a == c) {
            System.out.println(a + " " + a + " " + a);
        } else {
            if (a == b || a == c) {
                System.out.println(a + " " + a);
            }
            if (c == b) {
                System.out.println(c + " " + c);
            }
        }
    }
}


/*Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

 */