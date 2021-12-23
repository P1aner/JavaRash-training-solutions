package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));

    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date date = new Date();
        long s1 = date.getTime();

        insert10000(list);


        // напишите тут ваш код
        Date date2 = new Date();
        long s2 = date2.getTime();
        return (s2 - s1);

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, new Object());
        }
    }
}





/*
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.
 */

/*
845
6

Process finished with exit code 0
 */
