package com.javarush.task.task14.task1419;

import java.io.*;
import java.net.ServerSocket;
import java.net.SocketException;
import java.util.*;

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

        //напишите тут ваш код
        //1
        class NewThread implements Runnable {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    exceptions.add(e);
                }
            }
        }
        Thread tr = new Thread(new NewThread());
        tr.start();
        tr.interrupt();

        //2
        try {
            float i = 1 / 0;
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        //3
        try {
            FileReader reader = new FileReader("noFile.ok");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        //4
        try {
            String[] str = new String[0];
            str[2] = "new";
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        //5
        try {
            int i = Integer.parseInt("aga");
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        //6
        try {
            List<String> list = new ArrayList<>();
            list.get(2);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        //7
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            reader.close();
            String text = reader.readLine();
        } catch (IOException e) {
            exceptions.add(e);
        }

        //8
        try {
            String[] str = null;
            int length = str.length;
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        //9
        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        //10
        try {
            Map<Integer, Integer> numbers = new HashMap<>();
            numbers.put(1, 2);
            numbers.put(2, 1);
            numbers.put(12, null);
            for (Integer inter : numbers.keySet()) {
                numbers.remove(inter);
            }
        } catch (ConcurrentModificationException e) {
            exceptions.add(e);
        }
    }
}
/*
java.lang.ArithmeticException: / by zero
java.lang.InterruptedException: sleep interrupted
java.io.FileNotFoundException: noFile.ok (Не удается найти указанный файл)
java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0
java.lang.NumberFormatException: For input string: "aga"
java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 0
java.io.IOException: Stream closed
java.lang.NullPointerException
java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
java.util.ConcurrentModificationException

Process finished with exit code 0
 */
