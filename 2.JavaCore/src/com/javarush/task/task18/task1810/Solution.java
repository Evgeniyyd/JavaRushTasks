package com.javarush.task.task18.task1810;

import java.io.*;
import java.util.ArrayList;

/* +
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available() != 0) {
            int read = inputStream.read();
            list.add(read);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < 1000) {
                    inputStream.close();
                }
            }
        }
    }
    public static class DownloadException   extends Exception {
    }
}
