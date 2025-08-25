package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) throws IOException {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {
            String string = bufferedReader.readLine();
            if (string.contains("helicopter")) {
                result = new Helicopter();
            } else if (string.contains("plane")) {
                int read = bufferedReader.read();
                result = new Plane(read);
            }
        } catch (Exception ignore) {

        }
    }
}
//add your code here - добавьте код тут

