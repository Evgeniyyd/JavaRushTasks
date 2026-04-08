package com.javarush.task.task18.task1810;

import java.io.*;
import java.nio.file.Files;



/* +
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileInputStream inputStream = new FileInputStream((reader.readLine()))) {
        while (inputStream.read() != -1) {
                File file = new File(reader.readLine());
                long length = Files.size(file.toPath());
                if (length < 1000) {
                    throw new DownloadException();
                }
            }
        }
    }
    public static class DownloadException extends Exception {
    }
}
