package com.javarush.task.task05.task0504;


/*
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Васян", 12, 1, 4);
        Cat cat2 = new Cat("Жора", 11, 2, 3);
        Cat cat3 = new Cat("Григорий", 14, 4, 6);
    }

    public static class Cat {
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
    }
}



/*
Пару задач назад студенты секретного центра JavaRush создавали класс Cat. Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat, а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.
 */

/*

Process finished with exit code 0
 */