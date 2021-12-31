package com.javarush.task.task09.task0902;

/*
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String metodName = stackTraceElements[1].getMethodName();
        System.out.println(method4());
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String metodName = stackTraceElements[2].getMethodName();
        return metodName;
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String metodName = stackTraceElements[2].getMethodName();
        return metodName;
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String metodName = stackTraceElements[2].getMethodName();
        return metodName;
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String metodName = stackTraceElements[2].getMethodName();
        return metodName;
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String metodName = stackTraceElements[2].getMethodName();
        return metodName;
    }
}

/*
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
 */

/*
main

Process finished with exit code 0
 */








