package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов1", "Иван Особенный");
        map.put("Иванов2", "Иван2");
        map.put("Иванов3", "Иван1");
        map.put("Иванов4", "Иван2");
        map.put("Иванов5", "Иван3");
        map.put("Иванов6", "Иван1");
        map.put("Иванов7", "Иван2");
        map.put("Иванов8", "Иван3");
        map.put("Иванов9", "Иван1");
        map.put("Иванов0", "Иван2");
        return map;


    }

    public static Map<String, String> removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        int count = 0;
        for (Map.Entry<String, String> pairTwo : copy.entrySet()) {
            for (Map.Entry<String, String> pair : copy.entrySet()) {
                if (pairTwo.getValue().equals(pair.getValue())) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, pairTwo.getValue());
                count = 0;
            } else {
                count = 0;

            }
        }
        return map;
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(removeTheFirstNameDuplicates(createMap()));

    }
}

/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
 */

/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
 */

/*
{Иванов1=Иван Особенный}

Process finished with exit code 0
 */


