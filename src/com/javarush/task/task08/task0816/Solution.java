package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Смирнов1", dateFormat.parse("JANUARY 1 2012"));
        map.put("Смирнов2", dateFormat.parse("JANUARY 1 2012"));
        map.put("Смирнов3", dateFormat.parse("APRIL 1 2012"));
        map.put("Смирнов4", dateFormat.parse("JANUARY 1 2012"));
        map.put("Смирнов5", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Смирнов6", dateFormat.parse("MARCH 1 2012"));
        map.put("Смирнов7", dateFormat.parse("JULY 1 2012"));
        map.put("Смирнов8", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Смирнов9", dateFormat.parse("SEPTEMBER 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> mapa = new HashMap<>();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Date date = (Date) entry.getValue();
            if ((date.getMonth() != Calendar.JULY) && (date.getMonth() != Calendar.JUNE) && (date.getMonth() != Calendar.AUGUST)) {
                String s = (String) entry.getKey();
                mapa.put(s, date);
            }
        }
        map = mapa;
        iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());

    }
}



/*
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
 */
/*
Sun Jan 01 00:00:00 MSK 2012
Sun Jan 01 00:00:00 MSK 2012
Sun Apr 01 00:00:00 MSK 2012
Sun Jan 01 00:00:00 MSK 2012
Wed Feb 01 00:00:00 MSK 2012
Thu Mar 01 00:00:00 MSK 2012
Sat Dec 01 00:00:00 MSK 2012
Sat Sep 01 00:00:00 MSK 2012
Tue May 01 00:00:00 MSK 2012

Process finished with exit code 0
 */




/*
"Правильное решение"
    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
    }
 */




