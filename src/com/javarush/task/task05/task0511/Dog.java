package com.javarush.task.task05.task0511;

/*
Создать класс Dog
*/

public class Dog {
    //напишите тут ваш код
    String name;
    int growth;
    String color;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int growth) {
        this.name = name;
        this.growth = growth;
    }

    public void initialize(String name, int growth, String color) {
        this.name = name;
        this.growth = growth;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}




/*
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */
/*

Process finished with exit code 0
 */