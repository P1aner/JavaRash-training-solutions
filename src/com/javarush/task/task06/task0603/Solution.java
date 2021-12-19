package com.javarush.task.task06.task0603;

/*
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        int n = 0;
        while (n < 50000) {
            n++;
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
        for (int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}





/*
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
 */
/*

Process finished with exit code 0
Ага, 100 000 оказалось мало... Начало работать при превышении 300 000
 */