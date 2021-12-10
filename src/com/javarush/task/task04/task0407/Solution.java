package com.javarush.task.task04.task0407;

/*
Кошки во Вселенной
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.count = Cat.count + 1;
        //напишите тут ваш код

        Cat cat2 = new Cat();
        //напишите тут ваш код
        cat2.count = Cat.count + 1;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}


/*Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильное их количество.
* */


/*The cat count is 2

Process finished with exit code 0

 */
