package com.javarush.task.task04.task0401;

/*
Мне не подходит этот возраст…
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = this.age + age;
            System.out.println("Age in adjustAge() is: " + age);
        }
    }
}



/* Подумайте, что делает программа.
Исправь ошибку в программе чтобы переменная age объекта person изменила свое значение.

Подсказка:
тщательно просмотрите метод adjustAge */
/*
    Age is: 20
        Age in adjustAge() is: 20
        Adjusted age is: 40

        Process finished with exit code 0

 */
