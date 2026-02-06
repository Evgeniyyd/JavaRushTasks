package ru.javarush.java.core.level14.task06;

public class Solution {
    public static class Student{
        String studentName;
        int studentGrade;

        public Student(String studentName, int studentGrade) {
            this.studentName = studentName;
            this.studentGrade = studentGrade;
        }

    }
    public static void main(String[] args) {
        Student student = new Student("Василий",4);
        System.out.println( "Имя: " + student.studentName + ", оценка: " + student.studentGrade);
        // "Зачисляем" нового студента, сразу задавая имя и оценку в конструкторе


        // Торжественно объявляем о его появлении

    }
}

// Отдельный класс Student с полями и конструктором