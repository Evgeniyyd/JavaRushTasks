package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream streamArray = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(streamArray);
        System.setOut(stream);
        testString.printSomething();
        String string = streamArray.toString();
        System.setOut(out);
        String[] split = string.split("\\s+");
        int i = Integer.parseInt(split[0]);
        String s = String.valueOf(split[1]);
        int i2 = Integer.parseInt(split[2]);
        String s1 = String.valueOf(split[3]);
        int result;
        if (s.equals("+")) {
            result = i + i2;
        } else if (s.equals("-")) {
            result = i - i2;
        } else  {
            result = i * i2;
        }
        String format = String.format("%d %s %d %s %d", i, s, i2, s1,result);
        System.out.println(format);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

