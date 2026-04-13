package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException {
        super(fileName);
        try {
            int indexOf = fileName.indexOf(".t");
            String substring = fileName.substring(0, indexOf);
            if (substring.equals(".txt")) {
                throw new UnsupportedFileNameException();
            }
        } catch (UnsupportedFileNameException e) {
            super.close();
            throw new FileNotFoundException();
        }
    }
    public static void main(String[] args) {
    }
}

