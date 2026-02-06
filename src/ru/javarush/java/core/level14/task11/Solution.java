package ru.javarush.java.core.level14.task11;

// Класс-шаблон для автомобиля: хранит марку и год выпуска


public class Solution {
    public static void main(String[] args) {
        // Создаем два независимых объекта класса Car с помощью new
        Car car = new Car("Toyota", 2020);
        Car car1 = new Car("Lada", 2010);
        System.out.println("Марка: " + car.carBrand + ", год выпуска: " + car.carYear);
        System.out.println("Марка: " + car1.carBrand + ", год выпуска: " + car1.carYear);
    }

    public static class Car {
        String carBrand;
        int carYear;

        public Car(String carBrand, int carYear) {
            this.carBrand = carBrand;
            this.carYear = carYear;
        }
    }
}