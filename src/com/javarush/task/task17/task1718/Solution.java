package com.javarush.task.task17.task1718;

/*
Глажка
*/

/**
 * И снова быт...
 * Поставьте один synchronized, чтобы diana и igor гладили по очереди, ведь утюг всего один!
 * <p>
 * Подсказка:
 * использовать блокировку на уровне класса.
 */

public class Solution {
    public static void main(String[] args) {
        Person diana = new Person("Diana");
        Person igor = new Person("Igor");
        diana.start();
        igor.start();
    }

    public static class Person extends Thread { //Человек

        public Person(String name) {
            super(name);
        }

        @Override
        public void run() {

            Iron iron = takeIron();
            Clothes clothes = takeClothes();
            synchronized (Iron.class) {
                iron(iron, clothes);
            }
            returnIron();

        }

        protected Iron takeIron() {
            System.out.println("Taking the iron");
            return new Iron();
        }

        protected Iron returnIron() {
            System.out.println("Returning the iron");
            return new Iron();
        }

        protected Clothes takeClothes() {
            return new Clothes("T-shirt");
        }

        protected void iron(Iron iron, Clothes clothes) {
            System.out.println(getName() + " is ironing a " + clothes.name);
        }
    }

    public static class Iron {
    } //Утюг

    public static class Clothes {//Одежда
        String name;

        public Clothes(String name) {
            this.name = name;
        }
    }
}
/*
Taking the iron
Taking the iron
Diana is ironing a T-shirt
Returning the iron
Igor is ironing a T-shirt
Returning the iron

Process finished with exit code 0
 */
