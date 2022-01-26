package com.javarush.task.task14.task1404;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Коты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        List<String> cats = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = true;
        try {
            while (exit) {
                String name = reader.readLine();
                if (name.equals("")) {
                    break;
                }
                cats.add(name);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String cat : cats) {
            Cat kitty = CatFactory.getCatByKey(cat);
            System.out.println(kitty.toString());
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("Василий");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кисюлька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
/*
Давай напишем программу, которая будет давать имена всем котикам, выпускаемым на нашей котофабрике.
Для этого нужно:
Считывать строки (параметры) с консоли, пока пользователь не введет пустую строку (Enter).
Для каждого параметра (имени кота):
создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
вывести на экран cat.toString().
 */
/*
vaska
murka
kika
Kitty

Я - солидный кошак по имени Василий
Я - милая кошечка по имени Мурочка
Я уличный кот kika
Я уличный кот Kitty

Process finished with exit code 0
 */
