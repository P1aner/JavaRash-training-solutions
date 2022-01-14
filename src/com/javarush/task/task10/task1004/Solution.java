package com.javarush.task.task10.task1004;

/*
Задача №4 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        //  int nine =  (Integer.parseInt(String.valueOf(zero)) + number);
        //  System.out.println(nine);    //да-да, пошел я со своим умным решением
        int nine = (zero + number);
        System.out.println((char) nine);


    }
}
/*
Добавь одну операцию по преобразованию типа, чтобы на экран вывелось 9.
short number = 9;
char zero = '0';
int nine = (zero + number);
 */
/*
9

Process finished with exit code 0
 */
