package com.javarush.task.task06.task0612;

/*
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a + b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a * b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double) a / b;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return ((double) a / 100) * b;
    }

    public static void main(String[] args) {
        System.out.println(division(84, 31));
        System.out.println(percent(84, 31));
    }
}



/*
Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) - возвращает сумму чисел a и b
int minus(int a, int b) - возвращает результат вычитания из числа a числа b
int multiply(int a, int b) - возвращает результат умножения числа a на число b
double division(int a, int b) - возвращает результат деления числа a на число b
double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)

 */
/*
2.7096774193548385
26.04

Process finished with exit code 0
 */












