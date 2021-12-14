package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("ВВедите размерность прямоугольника:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(reader.readLine());
        int column = Integer.parseInt(reader.readLine());

        for (int lineTo = 0; lineTo < line; lineTo++) {
            for (int columnTo = 0; columnTo < column; columnTo++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}





/*
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888

 */
/*ВВедите размерность прямоугольника:
3
2
88
88
88

Process finished with exit code 0

 */