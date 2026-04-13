package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream name;

    public AmigoOutputStream(FileOutputStream name) throws FileNotFoundException {
        super(fileName);
        this.name = name;

    }

    @Override
    public void close() throws IOException {
           name.flush();
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("JavaRush © All rights reserved.");
            name.close();
            super.close();
        }
    }

    @Override
    public void flush() throws IOException {
        name.flush();

    }

    @Override
    public void write(int b) throws IOException {
       name.write(b);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
}
