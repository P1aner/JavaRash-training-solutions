package com.javarush.task.task09.task0920;

/*
Обратный отсчёт Ӏ Java Syntax: 9 уровень, 11 лекция
*/

import java.util.concurrent.TimeUnit;

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            //напишите тут ваш код
            try {
              //  Thread.sleep(100);
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
/*
Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
Обернуть вызов sleep в try..catch.
 */
/*
10
9
8
7
6
5
4
3
2
1
0

Process finished with exit code 0
 */



