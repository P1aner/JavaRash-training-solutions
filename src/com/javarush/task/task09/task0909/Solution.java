package com.javarush.task.task09.task0909;

/*
Исключение при работе с массивами
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        int[] m = new int[2];
        try {
            m[8] = 5;
        } catch (Exception e) {
            System.out.println(e);
        }

        //напишите тут ваш код
    }
}


/*
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
 */
/*
java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 2

Process finished with exit code 0
 */

