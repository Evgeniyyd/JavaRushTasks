package ru.javarush.java.core.level14.task04;

public class Solution {
    public static class Student{
        String studentName;
        int enrollmentYear;

        public Student(String studentName, int enrollmentYear) {
            this.studentName = studentName;
            this.enrollmentYear = enrollmentYear;
        }
    }
    public static void main(String[] args) {
        // Создаем два объекта Student и сразу инициализируем их поля через конструктор
Student student = new Student("Анна", 2022);
Student student1 = new Student("Иван", 2023);
        System.out.println("Имя: "+ student.studentName +", год поступления: " + student.enrollmentYear);
        System.out.println("Имя: "+ student1.studentName +", год поступления: " + student1.enrollmentYear);

        // Выводим информацию о каждом студенте в заданном формате

    }
}

// Класс-форма для студента: хранит имя и год поступления