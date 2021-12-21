package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            strings.add(reader.readLine());
        }
        for (int i = 0; i < m; i++) {
            String s = strings.get(0);
            strings.remove(0);
            strings.add(s);

        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}


/*
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
 */


/*
4
2
1qw
2as
3
4zx
3
4zx
1qw
2as

Process finished with exit code 0
 */

