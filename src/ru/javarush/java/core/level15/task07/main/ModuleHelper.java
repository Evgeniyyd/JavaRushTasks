package ru.javarush.java.core.level15.task07.main;

public class ModuleHelper {

    ru.javarush.java.core.level15.task07.main.ModuleMain provideInternalAssistance() {
        System.out.println("Предоставляю внутреннюю помощь модуля!");
        return new ModuleMain();
    }

}
// Метод без модификатора доступа — package-private.
// Доступен только внутри этого же пакета.
