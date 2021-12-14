package com.javarush.task.task04.task0437;

/*
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int m = 0; m < 10; m++) {
            for (int n = 0; n <= m; n++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}





/*Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888

 */
/*
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888

Process finished with exit code 0

 */