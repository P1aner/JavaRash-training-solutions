package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        return s;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        return Integer.parseInt(s);

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        return Double.parseDouble(s);

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s = reader.readLine();
        return Boolean.parseBoolean(s);
    }

    public static void main(String[] args) throws Exception {

    }
}





/*
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
 */













