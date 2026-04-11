package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream comp;

//    public static void main(String[] args) throws IOException {
//        try {
//
//            QuestionFileOutputStream questionFileOutputStream = new QuestionFileOutputStream();
//            questionFileOutputStream.close();
//        } catch (IOException e) {
//            throw new RuntimeException("Вы велли букву Д или д");
//        }
//
//    }



    public QuestionFileOutputStream(AmigoOutputStream comp) {
        this.comp = comp;
    }

    @Override
    public void flush() throws IOException {
        comp.flush();

    }

    @Override
    public void write(int b) throws IOException {
        comp.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        comp.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        comp.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        while (true) {
            String line = reader.readLine();
            if (!line.equals("Д")) {
            } else {
                reader.close();
            }
        }
    }
}



