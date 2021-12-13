package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Введите два имени:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        int n1 = name1.length();
        int n2 = name2.length();
        String vst = "";

        if (name1.equals(name2)) {
            vst = name1;
        } else if (n1 == n2) {
            vst = Integer.toString(n1);
        }


        System.out.println(vst);
    }
}





/* Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.

 */
/* Введите два имени:
Катя
Катя
Катя

Process finished with exit code 0


 */