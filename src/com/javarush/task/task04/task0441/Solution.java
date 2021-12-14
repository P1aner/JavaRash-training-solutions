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
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        if ((n1 >= n2 && n2 >= n3) || (n1 <= n2 && n2 <= n3)) {
            System.out.println(n2);
        } else {
            if ((n1 >= n3 && n3 >= n2) || (n1 <= n3 && n3 <= n2)) {
                System.out.println(n3);
            } else {
                System.out.println(n1);
            }
        }
    }
}


/*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.

 */
