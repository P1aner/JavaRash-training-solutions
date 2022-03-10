package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        try {
                            if (args[1 + i].equals("м")) {
                                allPeople.add(Person.createMale(args[i], format1.parse(args[2 + i])));
                            } else {
                                allPeople.add(Person.createFemale(args[i], format1.parse(args[2 + i])));
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        int ID = Integer.parseInt(args[i]);
                        allPeople.get(ID).setName(args[1 + i]);
                        allPeople.get(ID).setSex(args[2 + i].equals("м") ? Sex.MALE : Sex.FEMALE);
                        try {
                            allPeople.get(ID).setBirthDate(format1.parse(args[3 + i]));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int ID = Integer.parseInt(args[i]);
                        allPeople.get(ID).setName(null);
                        allPeople.get(ID).setSex(null);
                        allPeople.get(ID).setBirthDate(null);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int ID = Integer.parseInt(args[i]);
                        System.out.println(allPeople.get(ID).getName() +
                                " " +
                                (allPeople.get(ID).getSex().equals(Sex.MALE) ? "м" : "ж") +
                                " " +
                                format2.format(allPeople.get(ID).getBirthDate()));
                    }
                    break;
                }
        }
    }
}
