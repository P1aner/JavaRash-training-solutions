package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> sharesThree = new ArrayList<Integer>();
        ArrayList<Integer> sharesTwo = new ArrayList<Integer>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (number % 3 != 0 && number % 2 != 0) numbers.add(number);
            if (number % 3 == 0) sharesThree.add(number);
            if (number % 2 == 0) sharesTwo.add(number);
        }
        printList(sharesThree);
        printList(sharesTwo);
        printList(numbers);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


/*
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
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
3
6
9
12
15
18
2
4
6
8
10
12
14
16
18
20
1
5
7
11
13
17
19

Process finished with exit code 0
 */
