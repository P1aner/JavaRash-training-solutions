package com.javarush.task.task12.task1201;

/*
Киты и коровы
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() {
            return "Я не корова, Я - кит";
        }

    }
}
/*
Переопредели метод getName в классе Whale(Кит), чтобы программа выдавала:

Я не корова, Я - кит.
 */
/*
Я не корова, Я - кит

Process finished with exit code 0
 */
