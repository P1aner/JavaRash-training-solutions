package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String number = "0";

        while (!number.equals("сумма")) {
            sum = sum + Integer.parseInt(number);
            number = reader.readLine();
        }
        System.out.println(sum);
    }
}

/*
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;

        while (true) {
                String s = reader.readLine();
                if (s.equals("сумма")) {
                break;
                }
                sum = sum + Integer.parseInt(s);
                }
                System.out.println(sum);
                }
                }
*/


/*
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}
 */




