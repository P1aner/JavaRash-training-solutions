package com.javarush.task.task02.task0219;

/*
Печатаем трижды
*/

public class Solution {
    public static void print3(String text) {
        //напишите тут ваш код

        for (int i = 0; i < 2; i++) {
            System.out.print(text+ " ");
        }
        System.out.println(text);
    }



    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
/*Реализуй метод print3. Метод должен вывести переданную строку (слово) на экран три раза через пробел.*/




























