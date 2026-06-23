package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

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
//            int count = 0;
//            int nexOpen = 0;
//            int nexClosed = 0;
//            int startIndex = 0;
//            int tagStart = 0;
//            int tagEnd = 0;
//            String open = "<" + args[0];
//            String close = "</" + args[0] + ">";
//            String str = builder.toString();
//            while (startIndex != -1) {
//                nexOpen = str.indexOf(open, startIndex);
//                nexClosed = str.indexOf(close, startIndex + 1);
//                if (nexOpen < nexClosed && nexOpen != -1) {
//                    startIndex = nexOpen + 1;
//                    tagStart = nexOpen;
//                    count++;
//                } else if (nexOpen > nexClosed) {
//                    startIndex = nexClosed;
//                    count--;
//                }
//                if (count == 0) {
//                    tagEnd = nexClosed;
//                    String substring = str.substring(tagStart, tagEnd + close.length());
//                    System.out.println(substring);
//                }
//            }

            Document document = Jsoup.parse(builder.toString(), "", Parser.xmlParser());
            Elements elements = document.select(args[0]);
            elements.forEach(System.out::println);


        }
    }
}

