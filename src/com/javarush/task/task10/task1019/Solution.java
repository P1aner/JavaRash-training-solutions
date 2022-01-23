package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        int id = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        while (!name.equals("")) {
            map.put(name, id);
            id = Integer.parseInt(reader.readLine());
            name = reader.readLine();
        }
        map.put(name, id);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Id=" + entry.getValue() + " Name=" + entry.getKey());
        }

    }
}
/*
Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.

Ключевые требования:
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа должна выводить содержание HashMap на экран.
Каждую пару - с новой строки.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
 */

/*
1234
dsfasdf
232
xcvbfgh
4

Id=4 Name=
Id=232 Name=xcvbfgh
Id=1234 Name=dsfasdf

Process finished with exit code 0
 */
