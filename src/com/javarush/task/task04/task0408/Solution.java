package com.javarush.task.task04.task0408;

/*
Хорошо или плохо?
*/

public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int number) {
        //напишите тут ваш код
        if (number == 5) {
            System.out.println("Число равно 5");
        }
        if (number > 5) {
            System.out.println("Число больше 5");
        }
        if (number < 5) {
            System.out.println("Число меньше 5");
        }

    }
}

/* Написать метод compare(int number), чтобы он:
- выводил на экран строку "Число меньше 5", если параметр метода меньше 5,
- выводил строку "Число больше 5", если параметр метода больше 5,
- выводил строку "Число равно 5", если параметр метода равен 5.

 */
/*Число меньше 5
Число больше 5
Число равно 5

Process finished with exit code 0


 */
