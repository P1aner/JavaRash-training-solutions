package com.javarush.task.task09.task0919;

/*
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        System.out.println(0 / 0);
    }
}

/*
Создай метод public static void divideByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
 */

/*
java.lang.ArithmeticException: / by zero
	at com.javarush.task.task09.task0919.Solution.divideByZero(Person.java:16)
	at com.javarush.task.task09.task0919.Solution.main(Person.java:10)

Process finished with exit code 0
 */