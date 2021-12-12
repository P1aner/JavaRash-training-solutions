package com.javarush.task.task04.task0410;

/*
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int number) {
        //напишите тут ваш код
        String insert = "";
        if (number > 50 && number < 100) {

        } else {
            insert = " не";

        }
        System.out.printf("Число %d%s содержится в интервале.\n", number, insert);

    }
}

/*Напиши метод checkInterval. Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить результат на экран в следующем виде: "Число number не содержится в интервале." или "Число number содержится в интервале.", где number - аргумент метода.

Пример для числа 112:
Число 112 не содержится в интервале.

Пример для числа 60:
Число 60 содержится в интервале.

 */


/*Число 60 содержится в интервале.
Число 112 не содержится в интервале.
Число 10 не содержится в интервале.

Process finished with exit code 0

 */
