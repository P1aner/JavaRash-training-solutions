package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int score = 20;
        int[] smal1 = new int[score / 2];
        int[] smal2 = new int[score / 2];
        int[] big = new int[score];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < smal1.length; i++) {
            int number = Integer.parseInt(reader.readLine());
            smal1[i] = number;
            big[i] = number;
        }
        for (int i = 0; i < smal2.length; i++) {
            int number = Integer.parseInt(reader.readLine());
            smal2[i] = number;
            big[i + smal1.length] = number;
        }
        for (int i = 0; i < smal2.length; i++) {
            System.out.println(smal2[i]);
        }
    }
}




/*
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
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

Process finished with exit code 0
 */