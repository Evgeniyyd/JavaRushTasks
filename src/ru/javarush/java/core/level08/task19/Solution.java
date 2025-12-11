package ru.javarush.java.core.level08.task19;

public class Solution {
    public static void main(String[] args) {
        FactoryBox productBox = new FactoryBox();
        // Создаем объект класса FactoryBox

productBox.setDimensions(10);
        // Устанавливаем размер коробки с помощью метода setDimensions

        System.out.println(productBox.boxSize);
        // Выводим на экран текущий размер коробки

    }
}

class FactoryBox {
    // Публичное поле для хранения размера коробки
    public int boxSize;

    // Публичный метод для установки размера коробки
    public void setDimensions(int boxSize) {
        this.boxSize = boxSize;
        // Используем ключевое слово this, чтобы указать, что изменяем поле класса

    }
}