package com.javarush.task.task10.task1009;

/*
Правильный ответ: d = 5.5
*/

public class Solution {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + 1.0 * (b / c) / e;
        System.out.println(d);
    }
}
/*
Добавь в метод main() одну операцию по преобразованию типа, чтобы получался ответ: d = 5.5.
 */
/*
5.5

Process finished with exit code 0
 */
