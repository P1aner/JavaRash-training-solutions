package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > count) {
                count = strings.get(i).length();
            } else {
                System.out.println(i);break;
            }

        }
    }
}


/*
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 */

/*
1
12
123
1234
5
6
7
8
9
0

4

Process finished with exit code 0
 */