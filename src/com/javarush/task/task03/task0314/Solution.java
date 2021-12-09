package com.javarush.task.task03.task0314;

/*
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int k = 1; k < 11; k++) {
                System.out.print(k * i + " ");
            }
        }
    }
}



/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...

 */

