package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandpa1 = new Human("Вася", true, 65);
        Human grandpa2 = new Human("Виталий", true, 65);
        Human grandma1 = new Human("Ирина", false, 62);
        Human grandma2 = new Human("Людмила", false, 61);
        Human father = new Human("Олег", true, 41, grandpa1, grandma1);
        Human muther = new Human("Марина", false, 38, grandpa2, grandma2);
        Human soon1 = new Human("Ярик", true, 20, father, muther);
        Human soon2 = new Human("Владимир", true, 17, father, muther);
        Human dochter = new Human("Олеся", false, 15, father, muther);

        System.out.println(grandpa1.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma2.toString());
        System.out.println(father.toString());
        System.out.println(muther.toString());
        System.out.println(soon1.toString());
        System.out.println(soon2.toString());
        System.out.println(dochter.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}



/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...
 */



/*
Имя: Вася, пол: мужской, возраст: 65
Имя: Ирина, пол: женский, возраст: 62
Имя: Виталий, пол: мужской, возраст: 65
Имя: Людмила, пол: женский, возраст: 61
Имя: Олег, пол: мужской, возраст: 41, отец: Вася, мать: Ирина
Имя: Марина, пол: женский, возраст: 38, отец: Виталий, мать: Людмила
Имя: Ярик, пол: мужской, возраст: 20, отец: Олег, мать: Марина
Имя: Владимир, пол: мужской, возраст: 17, отец: Олег, мать: Марина
Имя: Олеся, пол: женский, возраст: 15, отец: Олег, мать: Марина

Process finished with exit code 0
 */











