package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    public int col = 7;

    @Override
    public int getCountOfEggsPerMonth() {
        return col;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "Моя страна" + " - " + Country.RUSSIA + "." + " " + "Я несу" + " "
                + getCountOfEggsPerMonth() + " " + "яиц в месяц" + ".";
    }
}
