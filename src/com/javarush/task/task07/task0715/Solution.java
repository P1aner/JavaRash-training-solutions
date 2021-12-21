package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/*
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<String>();
        array.add("мама");
        array.add("мыла");
        array.add("раму");
        for (int i = 1; i < 4; i += 2) {
            array.add(i, "именно");
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
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