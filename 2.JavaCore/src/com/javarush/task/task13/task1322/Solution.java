package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }
    public static class StringObject implements SimpleObject<String>{ //реализация интерфейса с параметром типа String {


        @Override
        public SimpleObject  getInstance() {
            return this;
        }
    }
    }


