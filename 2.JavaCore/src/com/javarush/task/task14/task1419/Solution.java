package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
       NullPointerException_Demo();
       ArrayIndexOutOfBoundsException_Demo();
       IllegalArgumentException();
       FilenotFound_Demo();
       ClassCastException();
       NegativeArraySizeException();
       NumberFormatException();
      ArrayStoreException();
        StringIndexOutOfBoundsException();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
    private static void NullPointerException_Demo(){
        String nuull = null;
        try {
            System.out.println(nuull.length());
        } catch (NullPointerException e1) {
            exceptions.add(e1);

        }
    }
    private static void ArrayIndexOutOfBoundsException_Demo(){
        try {
            int []ints = new int[10];
            System.out.println(ints[11]);
        }catch (ArrayIndexOutOfBoundsException e2){
            exceptions.add(e2);
        }
    }
    private static void IllegalArgumentException(){
              Thread thread = new Thread();
        try {
           thread.setPriority(10000);
            System.out.println(thread);
        } catch (IllegalArgumentException e3) {
            exceptions.add(e3);
        }
    }
    private static void FilenotFound_Demo(){
        try {
            File file = new File("E://File.txt");
            FileReader fileReader = new FileReader(file);
            System.out.println(fileReader);
        } catch (FileNotFoundException e4) {
            exceptions.add(e4);
        }
    }
    private static void ClassCastException(){
       Object object = null;
        try {
            Object x = new Integer[0];
            object = (String) x;
            System.out.println(object);
        } catch (ClassCastException e5) {
            exceptions.add(e5);

        }
    }
    private static void NegativeArraySizeException(){
       int i = -10;
        int a = -1000;
        try {
           int[] ints = new int[a + i];
        }catch (NegativeArraySizeException e6){
            exceptions.add(e6);
        }
    }
    private static void NumberFormatException() {
        String str  ="hjh";
        try {
            int number = Integer.parseInt(str);
            System.out.println(number);
        } catch (NumberFormatException e7) {
        exceptions.add(e7);
        }
    }
    private static void ArrayStoreException() {
        try {
          Object[] objects = new Double[2];
            objects[0] = 9;
           System.out.println(Arrays.toString(objects));
        } catch (ArrayStoreException e4) {
            exceptions.add(e4);
        }
    }
    private static void StringIndexOutOfBoundsException() {
        try {
            String string = "этопоисксимвола";
            int index = string.charAt(77);
            System.out.println(index);
                }catch (IndexOutOfBoundsException e9){
            exceptions.add(e9);
            }
    }
}

