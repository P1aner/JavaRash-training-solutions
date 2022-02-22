package com.javarush.task.task14.task1419;

import java.io.*;
import java.net.ServerSocket;
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
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        try {
            FileReader reader = new FileReader("noFile.ok");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        try {
            String[] str = new String[0];
            str[2] = "new";
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            int i = Integer.parseInt("aga");
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            List<String> list = new ArrayList<>();
            list.get(2);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            String text = null;
            if (text == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            throw new IOException();

        } catch (IOException e) {
            exceptions.add(e);
        }
        try {
            throw new SocketException();
        } catch (SocketException e) {
            exceptions.add(e);
        }
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            exceptions.add(e);
        }
        try {
            throw new Exception();
        } catch (Exception e) {
            exceptions.add(e);
        }
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
