package com.javarush.task.task16.task1630;

import java.io.*;

/*
Последовательный вывод файлов
*/
public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        Thread.sleep(400);
        systemOutPrintln(secondFileName);

    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws InterruptedException;


        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private StringBuilder builder = new StringBuilder();

        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;

        }

        public String getFileContent() {
            return builder.toString();

        }

        @Override
        public void run() {
            String line;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fullFileName));
                while (reader.ready()) {
                    line = reader.readLine();
                    builder.append(line).append(" ");
                }
            } catch (IOException i) {
                throw new RuntimeException();
            }
        }
    }
}
