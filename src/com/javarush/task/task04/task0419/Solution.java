package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Введите четыре числа:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int number4 = Integer.parseInt(reader.readLine());

        System.out.println(maxGet(maxGet(number1, number2), maxGet(number3, number4)));


    }

    private static int maxGet(int n1, int n2) {

        if (n1 >= n2) {
            n2 = n1;
        }
        return n2;
    }
}




/*Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

 */

/* Введите четыре числа:
1
2
3
4
4

Process finished with exit code 0


 */
