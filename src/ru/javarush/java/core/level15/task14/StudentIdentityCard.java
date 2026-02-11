package ru.javarush.java.core.level15.task14;

public  class StudentIdentityCard {
    static String studentName;

    public  StudentIdentityCard(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
}
