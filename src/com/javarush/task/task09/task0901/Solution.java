package com.javarush.task.task09.task0901;

/*
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        StackTraceElement[] stackTraceElements1 = method1();
        for (StackTraceElement element : stackTraceElements1) {
            System.out.println(element.getMethodName());
        }
    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();

    }
}

/*
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.
 */


/*
getStackTrace
main
getStackTrace
method1
main

Process finished with exit code 0
 */











