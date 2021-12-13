package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("ВВедите текст и число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int number = Integer.parseInt(reader.readLine());
        while (number > 0) {
            System.out.println(text);
            number--;
        }


    }
}





/*
Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв

 */
/*ВВедите текст и число
kjh
3
kjh
kjh
kjh

Process finished with exit code 0

 */