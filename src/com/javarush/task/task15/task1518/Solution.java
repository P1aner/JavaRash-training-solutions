package com.javarush.task.task15.task1518;

/*
Статики и котики
*/

/**
 * В этой задаче тебе нужно:
 * Создать класс Cat с публичным полем name типа String в классе Solution.
 * В статическом блоке создать объект типа Cat и присвоить его переменной cat (не забудь инициализировать поле name).
 * В статическом блоке вывести имя созданного кота на экран.
 * Примечание: не создавай конструкторы с параметрами в классе Cat.
 */

public class Solution {
    public static Cat cat;

    static {
        Solution.cat = new Cat();
        cat.name = "Васька";
        System.out.println(cat.name);
    }

    public static class Cat {
        public String name;
    }

    public static void main(String[] args) {

    }
}
/*
Васька

Process finished with exit code 0
 */
