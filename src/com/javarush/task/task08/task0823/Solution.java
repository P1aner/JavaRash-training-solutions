package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String finalize = "";
        finalize = finalize+ string.substring(0, 1).toUpperCase();
        for (int i = 1; i < string.length(); i++) {
            if (" ".equals(string.substring(i - 1, i))) {
                finalize = finalize+string.substring(i, i+1).toUpperCase();
            } else {
                finalize =finalize+ string.substring(i, i+1);

            }


            //напишите тут ваш код

        }System.out.println(finalize);
    }
}
/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.
 */

/*
мама мыла раму.
Мама Мыла Раму.

Process finished with exit code 0
 */