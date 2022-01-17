package com.javarush.task.task09.task0918;

/*
Все свои, даже исключения
*/

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends Exception {
    }

    static class MyException2 extends Exception {
    }

    static class MyException3 extends Error {
    }

    static class MyException4 extends Error {
    }
}
/*
Есть четыре класса MyException, MyException2, MyException3, MyException4.
Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.

Подсказка:
Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
 */

/*

Process finished with exit code 0
 */