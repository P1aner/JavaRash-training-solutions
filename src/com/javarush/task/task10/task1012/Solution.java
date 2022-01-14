package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args)/* throws Exception */ {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            try {
                String line = reader.readLine();
                list.add(line.toLowerCase());
            } catch (IOException e) {
                e.getStackTrace();
            }
        }

        // напишите тут ваш код
        for (Character lit : alphabet) {
            int count = 0;
            for (String text : list) {
                StringBuilder sText = new StringBuilder(text);
                for (int i = 0; i < text.length(); i++) {
                    if (sText.charAt(i) == lit) {
                        count++;
                    }
                }
            }
            System.out.println(lit.toString() + " " + count);
            count = 0;
        }
    }
}
/*
Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9
 */
/*
Введи с клавиатуры
Введи с клавиатуры
Введи с клавиатуры
Введи с клавиатуры
Введи с клавиатуры
Введи с клавиатуры
Введи с клавиатуры
Введи с клавиатуры
Введи с клавиатуры
Введи с клавиатуры
а 20
б 0
в 30
г 0
д 10
е 10
ё 0
ж 0
з 0
и 20
й 0
к 10
л 10
м 0
н 0
о 0
п 0
р 10
с 10
т 10
у 10
ф 0
х 0
ц 0
ч 0
ш 0
щ 0
ъ 0
ы 10
ь 0
э 0
ю 0
я 0

Process finished with exit code 0
 */






