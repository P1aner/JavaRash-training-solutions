package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i =0;i<10;i++){
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        for(int i = numbers.size()-1;i>=0; i--){
            System.out.println(numbers.get(i));
        }
    }
}


/*
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.

Подсказка:
Не забудь импортировать класс: java.util.ArrayList;
 */

/*
1
2
3
4
5
6
7
8
9
10
10
9
8
7
6
5
4
3
2
1

Process finished with exit code 0
 */
