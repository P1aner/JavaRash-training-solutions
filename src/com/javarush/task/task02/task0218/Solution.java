package com.javarush.task.task02.task0218;

/*
Повторенье-мать
*/

public class Solution {
    public static void print3(String text) {
        //напишите тут ваш код
        for (int i = 0; i < 3; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}

/*Реализуй метод print3. Метод должен вывести на экран переданную строку 3 раза.
Каждый раз с новой строки.*/