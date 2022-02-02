package com.javarush.task.task14.task1417;

public class Ruble extends Money {

    public static final String RUB = "RUB";

    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return RUB;
    }
}
