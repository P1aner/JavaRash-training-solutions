package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/*
Нашествие исключений
*/

/**
 * Заполни список exceptions десятью различными исключениями.
 * Первое исключение уже реализовано в методе initExceptions.
 */

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new SocketException());
        exceptions.add(new RuntimeException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new Exception());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        //напишите тут ваш код

    }
}
/*
java.lang.ArithmeticException: / by zero
java.io.IOException
java.io.FileNotFoundException
java.net.SocketException
java.lang.RuntimeException
java.lang.IndexOutOfBoundsException
java.lang.IllegalAccessException
java.lang.NumberFormatException
java.lang.Exception
java.lang.ArrayIndexOutOfBoundsException

Process finished with exit code 0
 */
