package ru.javarush.java.core.level14.task07;

public class Solution {
    public static class Counter {
        int currentValue;

        public void increment() {
            currentValue++;
        }

        public void printValue() {
            System.out.println(currentValue);
        }

    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.printValue();
        // Создаем и "запускаем" счётчик


        // "Нажимаем кнопку" три раза


        // Просим счётчик показать текущее значение (ожидается число 3)

    }
}