package ru.javarush.java.core.level10.task16;

// Перечисление космических тел с фиксированными значениями


public class Solution {
    public static void main(String[] args) {
        // 1) Создаем переменную типа CelestialBody и присваиваем ей MARS
     CelestialBody celestialBody = CelestialBody.MARS;
        System.out.println(celestialBody.name());
        // 2) Выводим официальное имя текущей планеты через специальный метод name()

        System.out.println(celestialBody.ordinal());
        // 3) Выводим "порядковый номер" текущей планеты через метод ordinal()


        // 4) Преобразуем строку "JUPITER" в значение перечисления через valueOf()
        String incoming = "JUPITER";
        System.out.println(CelestialBody.valueOf(incoming));

        // Выводим новое значение enum для подтверждения переключения

    }
    enum CelestialBody{
        EARTH,
        MARS,
        JUPITER
    }
}