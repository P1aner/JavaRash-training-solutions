package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        StringBuilder newUrl = new StringBuilder(url);
        for (int i = 0;;) {
            if (newUrl.charAt(0) == '?') {
                newUrl.deleteCharAt(0);
                break;
            } else {
                newUrl.deleteCharAt(0);
            }
        }
        System.out.println(newUrl);

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}


