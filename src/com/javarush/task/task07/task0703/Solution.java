package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 10;
        String[] text = new String[number];
        int[] lenght = new int[number];
        for (int i = 0; i < number; i++) {
            text[i] = reader.readLine();
            lenght[i] = text[i].length();
        }
        for (int i = 0; i < number; i++) {
            System.out.println(lenght[i]);
        }
    }
}



/*
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 */
/*
q
qw
qwe
qwer
qwert
qwerty
qwertyu
qwertyui
qwertyuio
qwertyuiop
1
2
3
4
5
6
7
8
9
10

Process finished with exit code 0
 */