package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int max = 1;
        int count = 0;
        List<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        Iterator<Integer> iterator = numbers.iterator();
        int first = numbers.get(0);
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number == first) {
                count++;
                if (count > max) {
                    max = count;
                }

            } else {
                first = number;
                count = 1;
            }


        }
        System.out.println(max);

    }
}

/*
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
 */


/*
1
1
1
1
1
1
1
1
1
2
9

Process finished with exit code 0
 */
