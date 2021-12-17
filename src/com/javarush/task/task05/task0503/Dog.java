package com.javarush.task.task05.task0503;


/*
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    //напишите тут ваш код
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Dog barbos = new Dog();
        barbos.setAge(12);
        barbos.setName("Барбос");
        System.out.println(barbos.getName() + " " + barbos.getAge());

    }
}


/*
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создай геттеры и сеттеры для всех переменных класса Dog.

 */
