package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Фамилия", "Имя");
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидр");
        map.put("Пыл", "Саша");
        map.put("Лещенко", "Паша");
        map.put("Фамилия1", "Имя1");
        map.put("Фамилия2", "Имя2");
        map.put("Фамилия3", "Имя3");
        map.put("Фамилия4", "Имя4");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String key : map.keySet()) {
            if (map.get(key).equals(name)) {
                count++;
            }
        }
        /*   Iterator iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (entry.getValue().equals(name)) {
                count++;
            }
        }    */
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код

        int count = 0;
        for (String key : map.keySet()) {
            if (key.equals(lastName)) {
                count++;
            }


        }
        return count;


    }

    public static void main(String[] args) {


        System.out.println(getCountTheSameFirstName(createMap(), "Саша"));
        System.out.println(getCountTheSameLastName(createMap(), "Пыл"));

    }
}


/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
 */


/*
1
1

Process finished with exit code 0
 */

