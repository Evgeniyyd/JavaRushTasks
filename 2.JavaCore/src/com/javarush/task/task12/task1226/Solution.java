package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {
    }
public interface CanFly{
         void fly();
}
public interface CanClimb{
        void climb();
}
public interface CanRun{
        void run();
}


public class Cat implements CanClimb, CanRun{
    @Override
    public void climb() {
    }

    @Override
    public void run() {

    }
}

    public class Dog implements CanRun{
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat  {// тигру мы не имплементуруем интерфейсы
        // так как он наслудует их по дефолту
    }

    public class Duck implements CanRun, CanFly{
        @Override
        public void run() {
        }

        @Override
        public void fly() {

        }
    }
}
