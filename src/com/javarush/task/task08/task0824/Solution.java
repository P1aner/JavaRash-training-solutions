package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("Сын1", true, 12);
        Human son2 = new Human("Сын2", true, 13);
        Human son3 = new Human("Сын3", true, 14);
        ArrayList<Human> children = new ArrayList<>();
        children.add(son1);
        children.add(son2);
        children.add(son3);
        Human father = new Human("Папа", true, 32, children);
        Human mather = new Human("Мама", false, 29, children);
        Human grandpa = new Human("Дедушка", true, 75, father);
        Human grandma = new Human("Бабушка", false, 72, mather);
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
        System.out.println(father.toString());
        System.out.println(mather.toString());
        System.out.println(grandpa.toString());
        System.out.println(grandma.toString());


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age, Human human) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(human);
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}





/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
 */











