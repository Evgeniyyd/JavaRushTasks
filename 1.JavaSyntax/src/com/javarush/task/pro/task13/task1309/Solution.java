package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Чёрт", 6.3);
        grades.put("вася", 5.3);
        grades.put("Сергей", 6.7);
        grades.put("Андрей", 4.2);
        grades.put("Серг", 2.4);

        }
    }

