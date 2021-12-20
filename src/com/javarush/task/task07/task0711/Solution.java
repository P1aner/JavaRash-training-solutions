package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {

            strings.add(0, strings.get(4));
            strings.remove(5);

        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}



/*
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
 */

/*
qw
er
rt
yu
io
rt
yu
io
qw
er

Process finished with exit code 0
 */
