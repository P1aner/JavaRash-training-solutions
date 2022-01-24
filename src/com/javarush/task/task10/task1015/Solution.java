package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;

/*
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] array = new ArrayList[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                array[i].add("Элемент" + i + j);
            }
        }


        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
/*
Создай массив, элементами которого будут списки строк.
Заполни массив любыми данными и выведи их на экран.
 */
/*
Элемент00
Элемент01
Элемент02
Элемент03
Элемент04
Элемент10
Элемент11
Элемент12
Элемент13
Элемент14
Элемент20
Элемент21
Элемент22
Элемент23
Элемент24
Элемент30
Элемент31
Элемент32
Элемент33
Элемент34
Элемент40
Элемент41
Элемент42
Элемент43
Элемент44

Process finished with exit code 0
 */
