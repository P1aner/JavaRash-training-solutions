package com.javarush.task.task15.task1528;

/*
ООП. Hryvnia — тоже деньги
*/

/**
 * Исправь класс Hryvnia так, чтоб избежать возникновения ошибки StackOverflowError.
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hryvnia extends Money {
        public double amount = 123d;

        public Hryvnia getMoney() {
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }
    }
}
/*
123.0

Process finished with exit code 0
 */

