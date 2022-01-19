package com.javarush.task.task12.task1205;

/*
Определимся с животным
*/

public class Solution {

    public static final String COW = "Корова";
    public static final String DOG = "Собака";
    public static final String WHALE = "Кит";
    public static final String PIG = "Свинья";
    public static final String NO_NAME = "Неизвестное животное";

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        if (o instanceof Cow){
            return COW;
        }
        if (o instanceof Dog){
            return DOG;
        }
        if (o instanceof Whale){
            return WHALE;
        }
        if (o instanceof Pig){
            return PIG;
        }

        return NO_NAME;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
/*
Напиши метод, который определяет, объект какого класса ему передали, и возвращает результат: одно из значений — «Корова», «Кит», «Собака», «Неизвестное животное».
 */
/*
Корова
Собака
Кит
Свинья

Process finished with exit code 0
 */
