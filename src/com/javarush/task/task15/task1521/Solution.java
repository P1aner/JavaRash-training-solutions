package com.javarush.task.task15.task1521;

import java.math.BigDecimal;

/*
ООП. Перегрузка
*/
/**
 * Для решения этой задачи:
 * Два раза перегрузи в классе Tree метод info(Object s) так, чтобы получилось три метода: info(Object s), info(Number s), info(String s).
 * Разберись в методе info(Object s). Сделай по аналогии функционал новых методов.
 * Например, для метода info(Number s) результат может быть таким: "Дерево № 123 , метод Number, параметр Short".
 */

public class Solution {
    public static void main(String[] args) {
        //Блок 2.
        //Вызов для Object
        new Tree().info((Object) new Integer("4"));
        new Tree().info((Object) new Short("4"));
        new Tree().info((Object) new BigDecimal("4"));

        //Блок 3.
        //Вызов для Number
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        //Блок 4.
        //Вызов для String
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
/*
Дерево № 1 , метод Object, параметр Integer
Дерево № 2 , метод Object, параметр Short
Дерево № 3 , метод Object, параметр BigDecimal
Дерево № 4 , метод Number, параметр Integer
Дерево № 5 , метод Number, параметр Short
Дерево № 6 , метод Number, параметр BigDecimal
Дерево № 7 , метод String, параметр String
Дерево № 8 , метод String, параметр String
Дерево № 9 , метод String, параметр String
Дерево № 10 , метод String, параметр String

Process finished with exit code 0
 */