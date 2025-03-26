package com.javarush.task.pro.task10.task1003;

/* 
Построим новый бизнес-комплекс JavaRush Business Center
*/

public class Skyscraper {
    private int floorsCount;
    private String developer;

   public  Skyscraper(){//конструктор без параметров
this.floorsCount = 5; // инициализация поля числовым значением
this.developer ="JavaRushDevelopment"; // инициализация поля строковым значением
   }
   public Skyscraper(int floorsCount, String string){
this.floorsCount = floorsCount; // инициализация поля числовым аргументом конструктора
this.developer = string;  // инициализация поля строковым аргументом конструктора
       System.out.println(floorsCount + "\n" + string);
   }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Неизвестно");
    }
}
