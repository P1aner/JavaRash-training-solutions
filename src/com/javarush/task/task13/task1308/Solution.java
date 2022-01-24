package com.javarush.task.task13.task1308;

/*
Эй, ты там живой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        boolean isAlive();
    }

    interface Presentable extends Person {

    }
}
/*
В этой задаче тебе нужно:
Создать интерфейс Person.
Добавить в него метод isAlive(), который проверяет, жив человек или нет.
Подумать, какой тип должен возвращать этот метод.
Создать интерфейс Presentable.
Унаследовать интерфейс Presentable от интерфейса Person.
 */
/*

Process finished with exit code 0
 */
