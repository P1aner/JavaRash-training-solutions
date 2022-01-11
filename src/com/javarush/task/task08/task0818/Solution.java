package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Сотрудник1", 1);
        map.put("Сотрудник2", 10);
        map.put("Сотрудник3", 100);
        map.put("Сотрудник4", 1000);
        map.put("Сотрудник5", 10000);
        map.put("Сотрудник6", 100000);
        map.put("Сотрудник7", 10);
        map.put("Сотрудник8", 10);
        map.put("Сотрудник9", 100);
        map.put("Сотрудник10", 1000);
        return map;
    }

    public static Map<String, Integer> removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        map.values().removeIf(num -> num < 500);
        /* HashMap<String, Integer> clone = new HashMap<>(map);
        for (Map.Entry<String, Integer> iter : clone.entrySet()) {
            if (iter.getValue() < 500) {
                map.remove(iter.getKey());
            }
        }*/
        return map;

    }

    public static void main(String[] args) {
        System.out.println(removeItemFromMap(createMap()));
    }
}

/*
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
 */

/*
{Сотрудник6=100000, Сотрудник5=10000, Сотрудник4=1000, Сотрудник10=1000}

Process finished with exit code 0
 */


