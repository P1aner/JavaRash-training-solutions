package com.javarush.task.task14.task1416;

/*
Стой, кто плывет?
*/

/**
 * Давай напишем программу, которая определит, что умеют делать жители океана:
 * Подумай, как связаны интерфейсы CanSwim (способен плавать) и CanWalk (способен ходить) с классом SeaCreature (морское животное).
 * Правильно расставь наследование интерфейсов и класса SeaCreature.
 * Подумай, как могут быть связаны классы Orca (Косатка), Whale (Кит), RiverOtter (Выдра) с классом SeaCreature.
 * Расставь правильно наследование между классами Orca, Whale, RiverOtter и классом SeaCreature.
 * У выбранных классов реализуй метод getCurrentCreature, чтобы он возвращал объект у которого его вызвали.
 * Подумай, какой класс должен реализовать интерфейс CanWalk и добавить интерфейс этому классу.
 * Подумай, какое животное еще не умеет плавать и добавить ему интерфейс CanSwim.
 */

public class Solution {
    public static void main(String[] args) {
        CanSwim creature = new Orca();
        creature.swim();
        creature = new Whale();
        creature.swim();
        creature = new RiverOtter();
        creature.swim();
    }

    public static void test(CanSwim creature) {
        creature.swim();
    }

    interface CanWalk {
        void walk();
    }

    interface CanSwim {
        void swim();
    }

    static abstract class SeaCreature implements CanSwim {
        public void swim() {
            SeaCreature currentCreature = (SeaCreature) getCurrentCreature();
            currentCreature.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is swimming");
        }

        abstract CanSwim getCurrentCreature();
    }

    static class Orca extends SeaCreature {
        @Override
        CanSwim getCurrentCreature() {
            return new Orca();
        }
    }

    static class Whale extends SeaCreature {

        @Override
        CanSwim getCurrentCreature() {
            return new Whale();
        }
    }

    static class RiverOtter implements CanSwim, CanWalk {
        private void displaySwim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is swimming");
        }

        private void displayWalk() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is walking");
        }

        @Override
        public void walk() {
            RiverOtter currentCreature = (RiverOtter) getCurrentCreature();
            currentCreature.displayWalk();
        }

        @Override
        public void swim() {
            RiverOtter currentCreature = (RiverOtter) getCurrentCreature();
            currentCreature.displaySwim();
        }

        CanSwim getCurrentCreature() {
            return new RiverOtter();
        }
    }
}
/*
Orca is swimming
Whale is swimming
RiverOtter is swimming

Process finished with exit code 0
 */



