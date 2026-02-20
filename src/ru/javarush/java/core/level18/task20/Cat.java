package ru.javarush.java.core.level18.task20;

public class Cat extends Animal{
    public Cat(String name) {
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println(name+ ":"+" Мяу!");
    }
}
