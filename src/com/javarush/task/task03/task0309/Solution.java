package com.javarush.task.task03.task0309;

/*
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        getSum(5);
    }

    public static void getSum(int S) {
        int Sum = 0;

        for (int i = 1; i <= S; i++) {
            System.out.println(Sum = Sum + i);
        }
    }


}
/*Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):
1
1+2=3
1+2+3=6
...

Пример вывода:
1
3
6
...

 */