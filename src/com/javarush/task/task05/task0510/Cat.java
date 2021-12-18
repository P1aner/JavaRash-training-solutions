package com.javarush.task.task05.task0510;

/*
Кошкоинициация
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    //напишите тут ваш код
    public void initialize(String name) {
        this.name = name;
        this.weight = 1;
        this.age = 3;
        this.color = null;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = null;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 1;
        this.age = age;
        this.color = null;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }

    public void initialize(int weight, String color, String address) {

        this.weight = weight;
        this.age = 3;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();

    }
}






/*
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.

 */
/*

Process finished with exit code 0
 */