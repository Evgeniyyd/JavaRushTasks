package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    public int coll = 12;

    @Override
    public int getCountOfEggsPerMonth() {
        return coll;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "Моя страна" + " - " + Country.MOLDOVA + "." + " " + "Я несу" + " "
                + getCountOfEggsPerMonth() + " " + "яиц в месяц" + ".";

    }

}
