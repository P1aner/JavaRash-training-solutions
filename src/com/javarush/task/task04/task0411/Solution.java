package com.javarush.task.task04.task0411;

/*
Время года
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        if (2 < month && month < 6) {
            System.out.println("Весна");
        }
        if (5 < month && month < 9) {
            System.out.println("Лето");
        }
        if (8 < month && month < 12) {
            System.out.println("Осень");
        }
        if (0<month && month <3 || 12 == month){
            System.out.println("Зима");
        }

    }
}


/*Напиши метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна

 */
/*Зима
Весна
Лето
Осень

Process finished with exit code 0


 */