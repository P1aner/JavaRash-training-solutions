package com.javarush.task.task09.task0906;

/*
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": " + text);

    }
}
/*
Реализовать метод log.
Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
Имя класса, имя метода и сообщение разделить двоеточием с пробелом.

Пример вывода:
com.javarush.task.task09.task0906.Solution: main: In main method
 */

/*
com.javarush.task.task09.task0906.Solution: main: In main method

Process finished with exit code 0
 */