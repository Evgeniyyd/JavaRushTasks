package com.javarush.task.task14.task1408;

public abstract class Hen {
    public String breed = "Я - курица.";

    abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return breed;
    }
}
//getDescription
