package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) /*throws Exception*/ {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = null;
        String vowels = "";
        String consonants = "";
        try {
            text = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        char[] textArray = text.toCharArray();
        for (char symbol : textArray) {
            if (isVowel(symbol)) {
                vowels += symbol + " ";
            } else if(symbol != ' ') {
                consonants += symbol + " ";
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}

/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .
 */

/*
Мама мыла раму.
а а ы а а у
М м м л р м .

Process finished with exit code 0
 */


