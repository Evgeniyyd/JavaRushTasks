package com.javarush.task.task15.task1501;

/* 
ОП - Расставить интерфейсы
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements  Movable,Sellable,Discountable{
        @Override
        public Object getAllowedAction() {
            return this;
        }

        @Override
        public boolean isMovable() {
            return false;
        }

        @Override
        public String getAllowedAction(String string) {
            return "";
        }
    }
}
