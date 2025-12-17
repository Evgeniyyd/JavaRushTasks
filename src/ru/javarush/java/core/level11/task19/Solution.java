package ru.javarush.java.core.level11.task19;

public class Solution {

    public static void main(String[] args) {
        // Вызов метода calculateReportData из main
calculateReportData();
    }
    public static void calculateReportData(){
      processRawNumbers();
    }
    public static void processRawNumbers(){
        System.out.println(100/0);

    }

}