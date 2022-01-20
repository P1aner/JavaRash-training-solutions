package com.javarush.task.task12.task1224;

/*
Неведома зверушка
*/

public class Solution {
    public static final String cat = "Кот";
    public static final String tiger = "Тигр";
    public static final String lion = "Лев";
    public static final String bull = "Бык";
    public static final String pig = "Свинья";

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        if (o instanceof Cat) {
            return cat;
        }
        if (o instanceof Tiger) {
            return tiger;
        }
        if (o instanceof Lion) {
            return lion;
        }
        if (o instanceof Bull) {
            return bull;
        }
        if (o instanceof Pig) {
            return pig;
        }
        return "Животное";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
/*
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «Животное».
 */
/*
Кот
Тигр
Лев
Бык
Свинья

Process finished with exit code 0
 */
