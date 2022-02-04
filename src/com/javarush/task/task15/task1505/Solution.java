package com.javarush.task.task15.task1505;

/*
ООП - исправь ошибки в наследовании
*/

/**
 * У каждого человека есть рост и вес. Класс Human реализует соответствующие интерфейсы. Но, похоже, в такой реализации закралась ошибка. Обрати внимание на вывод программы. Исправь ошибки в интерфейсах (подсказка: переименуй методы, согласно требований к задаче) и, соответственно, в остальном коде. На экран должны быть выведены рост и вес человека (любые положительные целые числа).
 */

public class Solution {
    public interface HasWeight {
        int getWeight();
    }

    public interface HasHeight {
        int getHeight();
    }

    public static class Human implements HasWeight, HasHeight {
        int weight = 0;
        int height = 0;

        @Override
        public int getWeight() {
            return this.weight;
        }

        @Override
        public int getHeight() {
            return this.height;
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getWeight());
        System.out.println(human.getHeight());
    }
}
/*
0
0

Process finished with exit code 0
 */
