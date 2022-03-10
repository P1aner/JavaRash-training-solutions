package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Файл в статическом блоке
*/

/**
 * Для решения этой задачи:
 * Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
 * В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.
 */

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try (FileReader fileReader = new FileReader(Statics.FILE_NAME);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String text = "";
            while ((text = bufferedReader.readLine()) != null) {
                lines.add(text);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
/*
[First string, Second string]

Process finished with exit code 0
 */

