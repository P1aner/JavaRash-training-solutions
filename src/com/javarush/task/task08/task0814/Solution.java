package com.javarush.task.task08.task0814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
*/

public class Solution {

    public static Set<Integer> createSet() throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(reader.readLine()));
        }
        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) {
                iterator.remove();

            }
        }
        return set;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(removeAllNumbersGreaterThan10(createSet()));


    }
}

/*
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
 */

/*
1
12
13
14
4
1235
23
5
62
3
[1, 3, 4, 5]

Process finished with exit code 0
 */