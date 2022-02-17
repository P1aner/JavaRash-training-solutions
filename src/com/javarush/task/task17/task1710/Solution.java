package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

/**
 * CRUD - Create, Read, Update, Delete.
 * <p>
 * Программа запускается с одним из следующих наборов параметров:
 * -c name sex bd
 * -r id
 * -u id name sex bd
 * -d id
 * <p>
 * Значения параметров:
 * name - имя, String
 * sex - пол, "м" или "ж", одна буква
 * bd - дата рождения в следующем формате 15/04/1990
 * -c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
 * -r - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
 * -u - обновляет данные человека с данным id
 * -d - производит логическое удаление человека с id, заменяет все его данные на null
 * <p>
 * id соответствует индексу в списке.
 * Все люди должны храниться в allPeople.
 * Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.
 * <p>
 * Пример параметров:
 * -c Миронов м 15/04/1990
 * <p>
 * Пример вывода для параметра -r:
 * Миронов м 15-Apr-1990
 * <p>
 * Если программа запущена с параметрами, то они попадают в массив args (аргумент метода main - String[] args).
 * Например, при запуске программы c параметрами:
 * -c name sex bd
 * получим в методе main
 * args[0] = "-c"
 * args[1] = "name"
 * args[2] = "sex"
 * args[3] = "bd"
 * Для запуска кода с параметрами в IDE IntellijIDEA нужно их прописать в поле Program arguments в меню Run -> Edit Configurations.
 */

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        //-c
        try {
            if (args[0].equals("-c") && args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], format.parse(args[3])));
                System.out.println(allPeople.size() - 1);
            }
            if (args[0].equals("-c") && args[2].equals("ж")) {
                allPeople.add(Person.createFemale(args[1], format.parse(args[3])));
                System.out.println(allPeople.size() - 1);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        //-r
        if (args[0].equals("-r")) {
            String sex;
            if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)) {
                sex = "м";
            } else {
                sex = "ж";
            }
            System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() + " " + sex + " " + format1.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));
        }
        //-u
        try {
            if (args[0].equals("-u")) {
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                allPeople.get(Integer.parseInt(args[1])).setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(format.parse(args[4]));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //-d
        if (args[0].equals("-d")) {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
        }
    }
}
/*
Петров Петр м 17-Feb-2022

Process finished with exit code 0
 */