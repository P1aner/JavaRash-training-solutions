package com.javarush.task.task09.task0903;

/*
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
        System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());

    }

    public static int method1() {
        method2();
        return  /*напишите тут ваш код*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return  /*напишите тут ваш код*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return  /*напишите тут ваш код*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        return  /*напишите тут ваш код*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        return  /*напишите тут ваш код*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
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


