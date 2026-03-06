package com.javarush.task.task16.task1630;

import java.io.*;

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
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws InterruptedException;

        void join() throws InterruptedException;

        void start();
    }

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

    public static class ReadFileThread extends Thread implements ReadFileInterface {


        public void setFileName(String fullFileName) {
            firstFileName = fullFileName;
        }

        public String getFileContent() {
            StringBuilder builder = new StringBuilder();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(firstFileName));
                String line;
                while (reader.ready()) {
                    line = reader.readLine();
                    builder.append(line).append(" ");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return builder.toString();
        }

        @Override
        public void start() {

        }

        @Override
        public void run() {
            String line;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(firstFileName));
                while (reader.ready()) {
                    line = reader.readLine();
                    if (!isAlive()) {
                        getFileContent();
                        System.out.println(line + " ");
                    }
                }
                getFileContent();
            } catch (IOException ignore) {
                throw new RuntimeException();
            }
        }
    }
    //напишите тут ваш код
}
