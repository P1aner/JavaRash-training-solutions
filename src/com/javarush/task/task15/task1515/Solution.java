package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Статики-2
*/

/**
 * В этой задаче тебе нужно:
 * В статическом блоке считать с консоли А и В — две переменные с типом int.
 * Обработать IOException в блоке catch.
 * Закрыть поток ввода методом close().
 */

public class Solution {
    public static int A;
    public static int B;

    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
/*
1
2
1

Process finished with exit code 0
 */
