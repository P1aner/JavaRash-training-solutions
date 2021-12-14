package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Введите три числа:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int average;
        if ((number1 >= number2 && number2 >= number3) || (number1 <= number2 && number2 <= number3)) {
            average = number2;
        } else {
            if ((number1 >= number3 && number3 >= number2) || (number1 <= number3 && number3 <= number2)) {
                average = number3;
            } else {
                average = number1;
            }
        }
        System.out.println(average);
    }
}


/*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.

 */
