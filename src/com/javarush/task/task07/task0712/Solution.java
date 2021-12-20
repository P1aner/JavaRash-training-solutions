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
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
            if (min > strings.get(i).length()) {
                min = strings.get(i).length();
            }
            if (max < strings.get(i).length()) {
                max = strings.get(i).length();
            }
        }
        System.out.println(firstMinOrMax(strings));
    }

    public static String firstMinOrMax(ArrayList<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == max || strings.get(i).length() == min) {
                return strings.get(i);
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