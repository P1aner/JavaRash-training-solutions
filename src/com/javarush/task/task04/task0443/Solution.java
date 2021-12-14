package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя:");
        String name = reader.readLine();
        System.out.println("Введите год рождения:");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("Введите месяц рождения:");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Введите день рождения:");
        int d = Integer.parseInt(reader.readLine());

        System.out.printf("Меня зовут %s.\nЯ родился %d.%d.%d", name,d,m,y);

    }
}




/*
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988
*/
/*Введите имя:
Имя
Введите год рождения:
1234
Введите месяц рождения:
12
Введите день рождения:
34
Меня зовут Имя.
Я родился 34.12.1234
Process finished with exit code 0

 */