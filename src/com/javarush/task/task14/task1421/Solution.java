package com.javarush.task.task14.task1421;

/*
Singleton
*/

/**
 * Класс является синглтоном (реализует паттерн Singleton), если позволяет создать всего один объект своего типа.
 *
 * Реализуй Singleton pattern:
 * Создай класс Singleton в отдельном файле.
 * Добавь в него статический метод getInstance().
 * При любом вызове метода getInstance() он должен возвращать один и тот же объект класса Singleton.
 * Подумай, каким образом можно запретить создание других объектов этого класса.
 * Сделай все конструкторы в классе Singleton приватными (private).
 * В итоге должна быть возможность создать объект (экземпляр класса) используя только метод getInstance.
 */

public class Solution {
    public static void main(String[] args) {
    }
    Singleton singleton = Singleton.getInstance();
}
/*

Process finished with exit code 0
 */


