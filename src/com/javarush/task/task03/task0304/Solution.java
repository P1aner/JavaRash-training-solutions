package com.javarush.task.task03.task0304;

/*
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        return i * (1.1);

    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}

/*Напиши код метода addTenPercent, который увеличивает переданное целое число на 10%.
Для возврата результата из метода addTenPercent используй оператор return.

Пример:
return 123 * 435;
*/