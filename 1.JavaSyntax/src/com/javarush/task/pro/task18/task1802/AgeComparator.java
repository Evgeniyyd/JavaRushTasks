package com.javarush.task.pro.task18.task1802;


/* 
Сортировка по возрасту
*/


import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {

        return o2.getAge() - o1.getAge();
    }
}
