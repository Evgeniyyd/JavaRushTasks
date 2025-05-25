package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
  public static   class Cat implements Eat,Movable, Edible{

        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }
   public static class Dog implements Eat,Movable{

        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }
  public static class Mouse implements  Edible,Movable{
      @Override
      public void beEaten() {

      }

      @Override
      public void move() {

      }
  }
}