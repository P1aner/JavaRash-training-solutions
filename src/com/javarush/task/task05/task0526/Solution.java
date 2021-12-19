package com.javarush.task.task05.task0526;

/*
Мужчина и женщина
*/

public class Solution {

    public static class Man {
        String name;
        int age;
        String address;

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man() {
        }

        public Man(String name) {
            this.name = name;
        }

        public Man(int age) {
            this.age = age;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(int age, String address) {
            this.age = age;
            this.address = address;
        }

    }

    public static class Woman {
        String name;
        int age;
        String address;

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(Woman woman) {
            return this.name + " " + this.age + " " + this.address;
        }

        public Woman() {
        }

        public Woman(String name) {
            this.name = name;
        }

        public Woman(int age) {
            this.age = age;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(int age, String address) {
            this.age = age;
            this.address = address;
        }
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Man planer = new Man("Павел", 28, "Могилев");
        Man catrun404 = new Man("Александр", 28, "Минск");
        Woman woman1 = new Woman("Женское имя1", 28, "Минск");
        Woman woman2 = new Woman("Женское имя2", 28, "Минск");

       /*
        System.out.println(planer.name + " " + planer.age + " " + planer.address);
        System.out.println(catrun404.name + " " + catrun404.age + " " + catrun404.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

        System.out.println(planer.toString());
        System.out.println(catrun404.toString());
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
*/
        System.out.println(planer);
        System.out.println(catrun404);
        System.out.println(woman1);
        System.out.println(woman2);

    }

    //напишите тут ваш код
}

/*
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
 */





/*
Павел 28 Могилев
Александр 28 Минск
Женское имя1 28 Минск
Женское имя2 28 Минск

Process finished with exit code 0
 */