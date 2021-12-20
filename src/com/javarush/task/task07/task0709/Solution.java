package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int min = Integer.MAX_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length() < min) {
                min = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++)
            if (strings.get(i).length() == min) {
                System.out.println(strings.get(i));
            }
    }
}


/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
 */


/*
qwer
qwer
qwer
qwer
qwe
qwe

Process finished with exit code 0

 */