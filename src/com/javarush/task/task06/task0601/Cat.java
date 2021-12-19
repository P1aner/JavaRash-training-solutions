package com.javarush.task.task06.task0601;

/*
Метод finalize класса Cat
*/

public class Cat {
    //напишите тут ваш код
    @Override
    protected void finalize() throws Throwable {
       super.finalize();
    }

    public static void main(String[] args) {

    }
}



/*
В классе Cat создать метод protected void finalize() throws Throwable.
 */

/*

Process finished with exit code 0
 */