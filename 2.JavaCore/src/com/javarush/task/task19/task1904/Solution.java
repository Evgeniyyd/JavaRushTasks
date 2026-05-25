package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        PersonScannerAdapter personAdapter = new PersonScannerAdapter(new Scanner("file"));
        personAdapter.read();
        System.out.println(personAdapter);
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            try (FileInputStream inputStream = new FileInputStream(fileScanner.nextLine())) {
                StringBuilder builder = new StringBuilder();
                int count;
                while ((count = inputStream.read()) != -1) {

                }
                return null;
            }
        }

        @Override
        public void close() throws IOException {
            this.fileScanner = fileScanner;


        }
    }
}
