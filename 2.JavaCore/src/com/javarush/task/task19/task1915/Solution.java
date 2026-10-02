package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        ByteArrayOutputStream arrayOutput = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(arrayOutput);
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream = new FileOutputStream(reader.readLine())) {
            System.setOut(stream);
            testString.printSomething();
            System.setOut(out);
            String string = arrayOutput.toString();
            System.out.println(string);
           outputStream.write(arrayOutput.toByteArray());
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

