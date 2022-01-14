package com.javarush.task.task10.task1013;

/*
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private int age;
        private String city;
        private String street;
        private int numberOfHous;

        public Human(String name, String lastName, int age, String city, String street, int numberOfHous) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
            this.street = street;
            this.numberOfHous = numberOfHous;
        }

        public Human(String name, String lastName, int age, String city, String street) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
            this.street = street;
        }

        public Human(String name, String lastName, int age, String city) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        public Human(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human() {
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public Human(String name, int age, String city, String street) {
            this.name = name;
            this.age = age;
            this.city = city;
            this.street = street;
        }


    }
}
/*
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
 */
/*

Process finished with exit code 0
 */
