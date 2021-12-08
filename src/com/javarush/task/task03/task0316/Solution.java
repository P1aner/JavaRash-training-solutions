package com.javarush.task.task03.task0316;

/*
Экранирование символов
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
    }
}

/*Вывести на экран следующий текст - две строки:
It's a Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's a Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"

Подсказка:
\” – экранирование двойной кавычки;
\\ – экранирование обратной косой черты (\).

Больше про экранирование символов и Escape-последовательности в Java читай в статье.
*/
