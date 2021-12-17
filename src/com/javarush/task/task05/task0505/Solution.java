package com.javarush.task.task05.task0505;

/*
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Кошан", 2, 3, 1);
        Cat cat2 = new Cat("Котан", 3, 1, 2);
        Cat cat3 = new Cat("Кот", 2, 3, 2);
        System.out.println("Кошан х Котан " + cat1.fight(cat2));
        System.out.println("Кошан х Кот " + cat1.fight(cat3));
        System.out.println("Котан х Кот " + cat2.fight(cat3));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}

/*
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.
 */

/*
Кошан х Котан false
Кошан х Кот false
Котан х Кот false

Process finished with exit code 0

 */












