package com.javarush.task.task12.task1225;

/*
Посетители
*/

public class Solution {

    public static final String TIGER = "Тигр";
    public static final String LION = "Лев";
    public static final String CAT = "Кот";
    public static final String BULL = "Бык";
    public static final String COW = "Корова";
    public static final String ANIMAL = "Животное";
    public static final String NO_ANIMAL = "Неуизвестное животное";

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        if (o instanceof Tiger) {
            return TIGER;
        }
        if (o instanceof Lion) {
            return LION;
        }
        if (o instanceof Cat) {
            return CAT;
        }
        if (o instanceof Bull) {
            return BULL;
        }
        if (o instanceof Cow) {
            return COW;
        }
        if (o instanceof Animal) {


            return ANIMAL;
        }
        return NO_ANIMAL;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
/*
Напиши метод, который определяет, какой объект в него передали.
Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».

Примечание: постарайся определять тип животного как можно более точно.
 */
/*
Кот
Тигр
Лев
Бык
Корова
Животное

Process finished with exit code 0
 */