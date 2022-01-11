package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/*
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> people = new HashMap<>();
        people.put("Иванов1", "Иван1");
        people.put("Иванов2", "Иван2");
        people.put("Иванов3", "Иван3");
        people.put("Иванов4", "Иван4");
        people.put("Иванов5", "Иван5");
        people.put("Иванов6", "Иван4");
        people.put("Иванов7", "Иван3");
        people.put("Иванов8", "Иван2");
        people.put("Иванов9", "Иван1");
        people.put("Иванов1", "Иван1");

        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

/*
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
 */
/*
Иванов2 Иван2
Иванов1 Иван1
Иванов9 Иван1
Иванов8 Иван2
Иванов7 Иван3
Иванов6 Иван4
Иванов5 Иван5
Иванов4 Иван4
Иванов3 Иван3

Process finished with exit code 0
 */