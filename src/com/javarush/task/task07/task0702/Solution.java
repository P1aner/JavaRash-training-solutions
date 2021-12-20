package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из строчек в обратном порядке
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            array[i] = reader.readLine();
        }
        for (int i = 9; i > 0; i--) {
            System.out.println(array[i]);
        }


    }
}

/*
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 */




/*
1
2
3
4
5
6
7
8
null
null
8
7
6
5
4
3
2

Process finished with exit code 0
 */

