package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        for (String string : strings) {
            if (min > string.length()) {
                min = string.length();
            }
            if (max < string.length()) {
                max = string.length();
            }
        }
        System.out.println(firstMinOrMax(strings));

    }

    public static String firstMinOrMax(ArrayList<String> strings) {

        for (String string : strings) {
            if (string.length() == max || string.length() == min) {
                return string;
            }
        }
        return null;
    }
}



/*
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
 */

/*
йцу
йцу
йцу
йцук
й
й
й
й
й
й
йцук

Process finished with exit code 0
 */