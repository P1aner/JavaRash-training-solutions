package com.javarush.task.task09.task0903;

/*
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int metodLine1 = stackTraceElements[1].getLineNumber();
        System.out.println(metodLine1);

    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int metodLine = stackTraceElements[2].getLineNumber();
        return  /*напишите тут ваш код*/ metodLine;
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int metodLine = stackTraceElements[2].getLineNumber();
        return  /*напишите тут ваш код*/ metodLine;
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int metodLine = stackTraceElements[2].getLineNumber();
        return  /*напишите тут ваш код*/ metodLine;
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int metodLine = stackTraceElements[2].getLineNumber();
        return  /*напишите тут ваш код*/ metodLine;
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int metodLine = stackTraceElements[2].getLineNumber();
        return  /*напишите тут ваш код*/ metodLine;
    }
}

/*
    Написать пять методов, которые вызывают друг друга.
        Метод должен вернуть номер строки кода, из которого вызвали этот метод.
        Воспользуйся функцией: element.getLineNumber().
         */
/*
10

Process finished with exit code 0
 */


