package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    String name;
    String sity;
    int cool;

    Solution(String sity, int cool) {

    }

    public static void main(String[] args) {
    }

    protected Solution(String name) {
        this.name = name;
    }

    void Solution(String sity, int cool) {
        this.sity = sity;
        this.cool = cool;
    }

    private Solution() {
        this.cool = 32;
    }

    public Solution(String name, String sity, int cool) {
        this.name = "Сергей";
        this.sity = "Москва";
        this.cool = 1;

    }
}

