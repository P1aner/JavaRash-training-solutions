package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("ВВедите три числа");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(reader.readLine()) > 0) number++;
        }

        System.out.println(number);


    }
}

/*
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
 */
/*ВВедите три числа
1
2
-1
2

Process finished with exit code 0

 */