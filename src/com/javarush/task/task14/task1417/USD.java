package com.javarush.task.task14.task1417;

public class USD extends Money {

    public static final String USD = "USD";

    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return USD;
    }
}
