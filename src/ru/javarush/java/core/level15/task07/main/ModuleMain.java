package ru.javarush.java.core.level15.task07.main;

public class ModuleMain {

    public static void main(String[] args) {
        ModuleHelper moduleHelper1 = new ModuleHelper();
        moduleHelper1.provideInternalAssistance();
        // Классы в одном пакете имеют доступ к package-private методам
    }


}