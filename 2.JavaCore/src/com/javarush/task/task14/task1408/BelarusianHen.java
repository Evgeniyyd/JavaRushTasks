package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    public int coll = 8;

    @Override
    public int getCountOfEggsPerMonth() {
        return coll;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "Моя страна" + " - " + Country.BELARUS + "." + " " + "Я несу" + " "
                + getCountOfEggsPerMonth() + " " + "яиц в месяц" + ".";
    }
}
