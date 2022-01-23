package com.javarush.task.task09.task0927;

import java.util.*;

/*
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> cats = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            cats.put("кот" + i, new Cat("кот" + i));
        }
        return  cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код

        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
/*
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.
 */

/*
Cat кот1
Cat кот3
Cat кот9
Cat кот4
Cat кот0
Cat кот6
Cat кот2
Cat кот5
Cat кот7
Cat кот8

Process finished with exit code 0
 */
