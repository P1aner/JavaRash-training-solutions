package com.javarush.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;

/*
Коллекция Map из Object
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код
        for (Map.Entry<String, Object> pair : map.entrySet()) {

            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}

/*
Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
Sim - 5
 */

/*
Tom - 5.5
Gevey - 6
Sim - 5
Arbus - false
Cat - Cat
Baby - null
Eat - 56
Hugs - 111111111111
Food - 3
Comp - 123.0

Process finished with exit code 0
 */