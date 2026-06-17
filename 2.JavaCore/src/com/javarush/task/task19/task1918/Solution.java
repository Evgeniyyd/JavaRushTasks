package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            int count = 0;
            int nexOpen;
            int nexClosed;
            int startIndex = 0;
            int tagStart = 0;
           int tagEnd=0;
            String open = "<" + args[0];
            String close = "</" + args[0] + ">";
            String str = builder.toString();
            while () {
                nexOpen = str.indexOf(open, startIndex);
                nexClosed = str.indexOf(close, startIndex + 1);
                if (nexOpen < nexClosed && nexOpen != -1) {
                    startIndex = nexOpen+1;
                    tagStart = startIndex;
                    count++;
                } else if (){
                    startIndex = nexOpen+1;
                    tagEnd = startIndex;
                    count--;
                }
            }
        }
    }
}

