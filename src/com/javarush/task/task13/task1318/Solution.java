package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine()), "UTF-8"));
            int i = -1;
            String text = "";
            while ((i = br.read()) != -1) {
                text += (char) i;
            }
            reader.close();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
/*
В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
 */
/*
D://1.txt
1ая строка Hello!
2ая строка Hello!

Process finished with exit code 0
 */
