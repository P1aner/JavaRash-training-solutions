package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class Solution {
    private static int even = 0;
    private static int odd = 0;

    private static String text = null;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] street = new int[15];
        for (int i = 0; i < street.length; i++) {
            street[i] = Integer.parseInt(reader.readLine());
        }
        mmm(street);
        print();


    }

    public static void mmm(int[] argss) {
        for (int i = 0; i < argss.length; i = i + 2) {
            even = even + argss[i];
        }
        for (int i = 1; i < argss.length; i = i + 2) {
            odd = odd + argss[i];
        }

    }

    public static void print() {
        if (even > odd) {
            text = "четными";
        } else {
            text = "нечетными";
        }
        System.out.printf("В домах с %s номерами проживает больше жителей.", text);
    }
}





/*
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.
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
1
1
1
1
1
1
В домах с четными номерами проживает больше жителей.
Process finished with exit code 0
 */
