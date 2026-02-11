package ru.javarush.java.core.level15.task17;

public class ApplicationModule {
    static String moduleStatusMessage;
    static {
        System.out.println(moduleStatusMessage = "Приложение: Главный модуль готов к работе!");
    }
}
