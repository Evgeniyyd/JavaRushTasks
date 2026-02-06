package ru.javarush.java.core.level14.task10;

public class Dog {
    // Поля с основной информацией о собаке
String dogName;
int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }
// Конструктор "регистрации": сразу присваиваем имя и возраст


    public static void main(String[] args) {
        // "Поступление" новой собаки в приют: задаём имя и возраст через конструктор
        Dog dog = new Dog("Шарик", 5);
        System.out.println("Собаку зовут "+dog.dogName +", ей "+ dog.dogAge+" лет");

        // Торжественное объявление о прибытии

    }
}