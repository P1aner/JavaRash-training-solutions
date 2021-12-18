package com.javarush.task.task05.task0522;

/*
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle (){
    }

    public Circle (double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle (double x, double y){
        this.x = x;
        this.y = y;
    }

    public Circle (double x){
        this.x = x;
    }

    public static void main(String[] args) {

    }
}
/*
Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.

Подсказка:
не забудь про конструктор по умолчанию.

 */

/*

Process finished with exit code 0
 */

