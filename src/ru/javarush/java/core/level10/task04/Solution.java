package ru.javarush.java.core.level10.task04;

public class Solution {
    public static void main(String[] args) {
        // Строковое значение, пришедшее от датчика
        String sensorReadingText = "NaN";
        Double parsedSensorData = Double.parseDouble(sensorReadingText);
        // Преобразуем строку в число типа double с помощью класса Double

        boolean naN = Double.isNaN(parsedSensorData);
        // Проверяем, является ли полученное значение "не числом" (NaN)
        System.out.println(naN);

        // Выводим результат проверки (true/false)

    }
}