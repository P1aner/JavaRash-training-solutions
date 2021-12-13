package com.javarush.task.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Фейс-контроль
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("ВВедите имя и возраст");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age > 20) {
            System.out.println("И 18 достаточно");
        }

    }
}
/* Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".

 */
/*ВВедите имя и возраст
Саша
28
И 18 достаточно

Process finished with exit code 0


 */