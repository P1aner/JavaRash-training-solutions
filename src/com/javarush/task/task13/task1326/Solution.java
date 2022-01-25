package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/*
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "";
        List<Integer> numbers = new ArrayList<>();
        try {

            FileInputStream fileInputStream = new FileInputStream(reader.readLine());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                text += (char) i;
            }
            String[] subText = text.split("\n");
            for (String sub : subText) {
                if (Integer.parseInt(sub) % 2 == 0) {
                    numbers.add(Integer.parseInt(sub));
                }


            }
            Collections.sort(numbers);
            for (Integer numb : numbers) {
                System.out.println(numb + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10
 */
/*
C:\Users\Павел\Desktop\1.txt
-2
2
8
10

Process finished with exit code 0
 */

