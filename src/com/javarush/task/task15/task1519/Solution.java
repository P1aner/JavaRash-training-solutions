package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Разные методы для разных типов
*/

/**
 * В этой задаче тебе нужно:
 * Считывать с консоли данные, пока не будет введено слово "exit".
 * Для каждого значения, кроме "exit", вызвать метод print(). Если значение:
 * содержит точку '.', вызвать метод print() для Double;
 * больше нуля, но меньше 128, вызвать метод print() для short;
 * меньше либо равно нулю или больше либо равно 128, вызвать метод print() для Integer;
 * иначе — вызвать метод print() для String.
 */

public class Solution {
    public static void main(String[] args) {
        //напиште тут ваш код


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String value = reader.readLine();
            while (!(value.equals("exit"))) {

                try {
                    Integer number = Integer.parseInt(value);
                    if (number > 0 && number < 128) {
                        print(Short.parseShort(String.valueOf(number)));
                    } else {
                        print(number);
                    }
                } catch (NumberFormatException e2) {
                    try {
                        Double number = Double.parseDouble(value);
                        print(number);
                    } catch (NumberFormatException e3) {
                        print(value);
                    }
                }
                value = reader.readLine();
            }


        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
/*
123
Это тип short, значение 123
128
Это тип Integer, значение 128
132513543
Это тип Integer, значение 132513543
2436354562454432523
Это тип Double, значение 2.4363545624544328E18
234234234234234234234234234234234
Это тип Double, значение 2.3423423423423423E32
werwe
Это тип String, значение werwe

Process finished with exit code 130
 */
