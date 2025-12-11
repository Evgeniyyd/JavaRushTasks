package ru.javarush.java.core.level08.task03;

public class GameScore {
    private static int totalGameScore = 0;

    // Приватный общий счет для всей игры — доступен только внутри класса
  public   static void collectCoin() {
        // Увеличиваем счет на 1 каждый раз, когда игрок собирает монетку
        totalGameScore++;
    }

   public static void displayCurrentScore() {
       System.out.println(totalGameScore);
    }


    // Выводим текущий общий счет на экран


    public static void main(String[] args) {
       collectCoin();
       collectCoin();
       collectCoin();
       displayCurrentScore();


        // Показываем текущий счет

    }
}