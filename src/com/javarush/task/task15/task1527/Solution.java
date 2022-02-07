package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Парсер реквестов
*/

/**
 * Для решения этой задачи тебе нужно:
 * Считать с консоли URL-ссылку.
 * Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
 * URL содержит минимум 1 параметр.
 * Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
 * Если присутствует параметр obj, то передать его значение в нужный метод alert():
 * alert(double value) - для чисел (не забывай о том, что число может быть дробным);
 * alert(String value) - для строк.
 * Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.
 * Пример 1
 * <p>
 * Ввод:
 * http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
 * <p>
 * Вывод:
 * lvl view name
 * <p>
 * Пример 2
 * <p>
 * Ввод:
 * http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
 * <p>
 * Вывод:
 * obj name
 * double: 3.14
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        Map<String, String> map = new LinkedHashMap<>();
        StringBuilder newUrl = new StringBuilder(url);
        for (; ; ) {
            if (newUrl.charAt(0) == '?') {
                newUrl.deleteCharAt(0);
                break;
            } else {
                newUrl.deleteCharAt(0);
            }
        }
        String text = String.valueOf(newUrl);
        String[] es = text.split("&");
        for (String test : es) {
            String[] es1 = test.split("=");
            if (es1.length > 1) {
                map.put(es1[0], es1[1]);
            } else {
                map.put(es1[0], null);
            }
        }
        String text1 = "";
        for (String te : map.keySet()) {
            text1 += te + " ";
        }
        StringBuilder builder = new StringBuilder(text1);
        builder.deleteCharAt(text1.length() - 1);
        System.out.println(builder);


        for (String test : map.keySet()) {
            if (test.equals("obj")) {
                try {
                    double number = Double.parseDouble(map.get(test));
                    alert(number);
                } catch (NumberFormatException e) {
                    alert(map.get(test));
                }
            }
        }


    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
/*
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
obj name
double: 3.14

Process finished with exit code 0
 */
/*
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
lvl view name

Process finished with exit code 0
 */
