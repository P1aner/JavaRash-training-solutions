package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("ВВодите числа:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int number = 0;
        while (!(number == -1)) {
            number = Integer.parseInt(reader.readLine());
            sum = sum + number;
        }
        System.out.println(sum);
    }


}


/*
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}

 */

/*
ВВодите числа:
1
2
3
-1
5

Process finished with exit code 0
 */