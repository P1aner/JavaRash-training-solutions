package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/*
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<>();
        array.add("мама");
        array.add("мыла");
        array.add("раму");
        String imenno = "именно";
        for (int i = 1; i < array.size(); i += 2) {
            array.add(i, imenno);
        }
        for (String s : array) {
            System.out.println(s);
        }
    }
}



/*
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.
 */
/*
мама
именно
мыла
именно
раму

Process finished with exit code 0
 */