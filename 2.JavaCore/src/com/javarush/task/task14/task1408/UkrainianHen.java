package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    public int coll = 8;

    public int getCountOfEggsPerMonth() {
        return coll;
    }


    public String getDescription() {
        return super.getDescription() + " " + "Моя страна" + " - " + Country.UKRAINE + "." + " " + "Я несу" + " "
                + getCountOfEggsPerMonth() + " " + "яиц в месяц" + ".";
    }

}
