package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.DoubleToIntFunction;

import static java.lang.Double.parseDouble;

/*
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите время:");
        double time = parseDouble(reader.readLine());
        while (time >= 5) {
            time = time - 5;
        }
        if (time >= 0 && time < 3) {
            System.out.println("Зеленый");
        }
        if (time >= 3 && time < 4) {
            System.out.println("Жёлтый");
        }
        if (time >= 4 && time < 5) {
            System.out.println("Красный");
        }

    }
}



/*Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.

Пример для числа 2.5:
зелёный

Пример для числа 3:
жёлтый

Пример для числа 4:
красный

Пример для числа 5:
зелёный

 */
/* Введите время:
5
Зеленый

Process finished with exit code 0
 */