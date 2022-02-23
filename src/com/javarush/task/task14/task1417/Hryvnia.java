package com.javarush.task.task14.task1417;

public class Hryvnia extends Money {

    public static final String UAH = "UAH";

    public Hryvnia(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return UAH;
    }
}
