package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0;i<10;i++){
            strings.add(0, reader.readLine());
        }
        for (int i =0;i<strings.size();i++){
            System.out.println(strings.get(i));
        }
    }
}

/*
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 */

/*
1q
2w
3e
4r
5t
6y
7u
8i
9o
0p
0p
9o
8i
7u
6y
5t
4r
3e
2w
1q

Process finished with exit code 0
 */

