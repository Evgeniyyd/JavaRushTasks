package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args)throws IOException{

    }

    static {
        try {
            reset();
        } catch (IOException ignore) {

        }
    }

    public static CanFly result;

    public static void reset() throws IOException{
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        if (string.contains("helicopter")){
            result = new Helicopter();
        }
        if (string.contains("plane")){
            bufferedReader.read();
            result = new Plane(43);
        }
    }
}
//add your code here - добавьте код тут

