package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/*
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> stringList = new HashSet<String>();
        for (int i = 0;i<20;i++){
        stringList.add("Лопата "+i);
        }
        return stringList;

    }

    public static void main(String[] args) {
        Set<String> stringList = new HashSet<String>();
        stringList = createSet();
    }
}


/*
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
 */
/*

Process finished with exit code 0
 */