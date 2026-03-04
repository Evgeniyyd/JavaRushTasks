package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //напишите тут ваш код

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            FileReader fileReader = new FileReader(firstFileName);
            FileReader fileReader1 = new FileReader(secondFileName);
            reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static class ReadFileThread extends Solution implements ReadFileInterface {


        public void setFileName(String fullFileName) {


        }

        public String getFileContent() {
            return secondFileName;
        }

        @Override
        public void join() throws InterruptedException {

        }

        @Override
        public void start() {

        }

        public void run() {
        }
    }
    //напишите тут ваш код
}
