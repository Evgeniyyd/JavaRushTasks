package ru.javarush.java.core.level14.task05;

public class Solution {
    public static class Car {
        String carBrand;
        int productionYear;

        public Car(String carBrand, int productionYear) {
            this.carBrand = carBrand;
            this.productionYear = productionYear;
        }

        public void displayDetails() {
            System.out.println("Марка: " + carBrand+ ", год выпуска:"+ productionYear);
        }
    }

    public static void main(String[] args) {
        // Создаем объект Car с произвольными значениями марки и года выпуска
        Car car = new Car("Нисан", 1994);
        Car car1 = new Car("Мерседес", 1992);
         car1.displayDetails();
         car.displayDetails();
        // Просим автомобиль "представиться"

    }
}

// Класс Car хранит марку и год выпуска и умеет выводить информацию о себе