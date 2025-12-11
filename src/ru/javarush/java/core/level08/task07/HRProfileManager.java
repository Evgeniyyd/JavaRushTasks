       package ru.javarush.java.core.level08.task07;

public class HRProfileManager {
    // Статический метод принимает имя и возраст сотрудника,
    // формирует строку карточки и выводит её на экран
    public static void displayEmployeeCard(String employeeName, int employeeAge) {
        System.out.println( "Имя сотрудника: " + employeeName+ ", Возраст: "+employeeAge);

    }

    public static void main(String[] args) {
        // Проверяем работу метода на примере
        displayEmployeeCard("Олег", 30);
    }
}