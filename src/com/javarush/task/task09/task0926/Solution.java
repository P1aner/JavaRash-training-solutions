package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Iterator;

/*
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[5]);
        list.add(new int[2]);
        list.add(new int[4]);
        list.add(new int[7]);
        list.add(new int[0]);
        for (int[] arrays : list) {
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = (int) (Math.random()*100);
            }

        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

/*
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
 */
/*
17
68
33
43
26
49
29
32
99
55
94
58
71
19
47
74
9
71

Process finished with exit code 0
 */