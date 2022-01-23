package com.javarush.task.task12.task1227;

/*
CanFly, CanRun, CanSwim для классов Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanFly,CanRun,CanSwim{

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements CanRun,CanSwim{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Toad implements CanRun,CanSwim{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }
}
/*
Есть интерфейсы CanFly (летать), CanSwim (плавать), CanRun (бегать).
Добавь эти интерфейсы классам Duck (утка), Penguin (пингвин), Toad (жаба)
 */
/*

Process finished with exit code 0
 */






