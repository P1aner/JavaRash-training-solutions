package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/*
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> newString = new ArrayList<String>();

        for (int i = 0; i < strings.size(); i++) {
            if ((strings.get(i).indexOf("л") == -1 && strings.get(i).indexOf("р") == -1) || (strings.get(i).indexOf("л") != -1 && strings.get(i).indexOf("р") != -1)) {
                newString.add(strings.get(i));
            } else {
                if (strings.get(i).indexOf("л") != -1) {
                    newString.add(strings.get(i));
                    newString.add(strings.get(i));
                }


            }
        }
        return newString;
    }
}

/*
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза

Выходные данные:
лира
лоза
лоза
 */

/*
лоза
лоза
лира

Process finished with exit code 0
 */