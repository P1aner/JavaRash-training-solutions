package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/*
Исключение при работе с коллекциями List
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();
        try {
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //напишите тут ваш код
    }
}


/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);
 */
/*
java.lang.IndexOutOfBoundsException: Index 18 out of bounds for length 0

Process finished with exit code 0
 */