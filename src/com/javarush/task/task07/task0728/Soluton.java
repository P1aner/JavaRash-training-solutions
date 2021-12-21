package com.javarush.task.task07.task0728;

import java.io.BufferedReader;

/*
В убывающем порядке
*/

public class Soluton {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

    }

}





/*
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
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
11
12
13
14
15
16
17
18
19
20
20
19
18
17
16
15
14
13
12
11
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

