package com.javarush.task.task14.task1408;

class BelarussianHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 4;
    }
}