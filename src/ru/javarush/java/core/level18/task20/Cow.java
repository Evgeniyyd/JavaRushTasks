package ru.javarush.java.core.level18.task20;

public class Cow extends Animal{
    public Cow(String name) {
        this.name =name;
    }

    @Override
    void makeSound() {
        System.out.println(name+":"+" Мууу!");
    }
}
