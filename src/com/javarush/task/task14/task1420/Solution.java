package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.javarush.task.task02.task0214.Solution.min;


/*
НОД
*/

/**
 * Давай найдем наибольший общий делитель (НОД). Для этого:
 * Введи с клавиатуры 2 целых положительных числа.
 * Выведи в консоли наибольший общий делитель.
 */

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer numberOne = 0;
        Integer numberTwo = 0;
        try {
            numberOne = Integer.parseInt(reader.readLine());
            numberTwo = Integer.parseInt(reader.readLine());

        } catch (NumberFormatException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Nod(numberOne, numberTwo));

    }

    private static int Nod(Integer numberOne, Integer numberTwo) {
        if (numberOne < 1 || numberTwo < 1) {
            throw new IllegalArgumentException("Ощибка, числа так себе");
        }
        int nod = 1;
        for (int i = min(numberOne, numberTwo); i > 1; i--) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                nod *= i;
                numberOne /= i;
                numberTwo /= i;
            }
        }
        return nod;
    }
}

/*
100
1000
100

Process finished with exit code 0
 */




