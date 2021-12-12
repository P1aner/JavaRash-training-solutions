package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;


/*
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите величину первой стороны:");
        int a = parseInt(reader.readLine());
        System.out.println("Введите величину второй стороны:");
        int b = parseInt(reader.readLine());
        System.out.println("Введите величину третьей стороны:");
        int c = parseInt(reader.readLine());


        if (a+b>c && a+c>b && b+c>a){
            System.out.println("Существует");}
        else {
            System.out.println("Не существует");
        }

    }
}

/*Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других, то треугольника с такими сторонами не существует.

 */
/*Введите величину первой стороны:
1
Введите величину второй стороны:
5
Введите величину третьей стороны:
1
Не существует

Process finished with exit code 0

 */