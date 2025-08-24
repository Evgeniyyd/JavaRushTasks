package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        new TeaMaker().pour();
        new TeaMaker().getRightCup();
        new TeaMaker().putIngredient();
        new LatteMaker().getRightCup();
        new LatteMaker().pour();
        new LatteMaker().putIngredient();
    }
}
