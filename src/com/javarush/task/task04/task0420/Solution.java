package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        System.out.println("ВВедите количество чисел, которое хотите отсортировать:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] myArray;
        myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n-1; k++) {
                if (myArray[k] > myArray[k + 1]) {
                    int max = 0;
                    max = myArray[k];
                    myArray[k] = myArray[k + 1];
                    myArray[k + 1] = max;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(myArray[i]+" ");
        }


    }
}

/* Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.

 */
/* ВВедите количество чисел, которое хотите отсортировать:
5
5
4
3
2
1
1 2 3 4 5
Process finished with exit code 0

 */