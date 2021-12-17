package com.javarush.task.task05.task0501;

/*
Создание кота
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public static void main(String[] args) {
        Cat vaska = new Cat("Vaska", 12, 1, 1);
        System.out.println(vaska.age);
    }
}


/*
Создать класс Cat. У кота должно быть имя (name, String),
 возраст (age, int), вес (weight, int), сила (strength, int).
 */
/*
12

Process finished with exit code 0

 */