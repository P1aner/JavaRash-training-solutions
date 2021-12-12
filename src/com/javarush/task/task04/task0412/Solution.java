package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Double.parseDouble;


/*
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n1 = parseDouble(reader.readLine());
        if (n1 < 0) {
            n1 = n1 + 1;
        } else {
            if (n1 > 0) {
                n1 = n1 * 2;
            } else {
                if (n1 == 0) {
                //не делать ничего
                }
            }
        }
        System.out.println(n1);

    }

}

/*
    Ввести с клавиатуры число.
        Если число положительное, то увеличить его в два раза.
        Если число отрицательное, то прибавить единицу.
        Если введенное число равно нулю, необходимо вывести ноль.
        Вывести результат на экран.

 */