package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        List<String> oneList = new ArrayList<>();
        List<String> twoList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileOne = new BufferedReader(new FileReader(reader.readLine()));
             BufferedReader fileTwo = new BufferedReader(new FileReader(reader.readLine()))) {

            while (fileOne.ready()) {
                String readOne = fileOne.readLine();
                oneList.add(readOne);
            }
            while (fileTwo.ready()) {
                String readTwo = fileTwo.readLine();
                twoList.add(readTwo);
            }
        }
        while (!oneList.isEmpty() && !twoList.isEmpty()) {
            if (oneList.get(0).equals(twoList.get(0))) {
                lines.add(new LineItem(Type.SAME, oneList.get(0)));
                oneList.remove(0);
                twoList.remove(0);
            } else if (oneList.get(0).equals(twoList.get(1))) {
                lines.add(new LineItem(Type.ADDED, twoList.get(0)));
                twoList.remove(0);
            } else if (oneList.get(1).equals(twoList.get(0))) {
                lines.add(new LineItem(Type.REMOVED, oneList.get(0)));
                oneList.remove(0);
            }
        }
        if (oneList.isEmpty()) {
            lines.add(new LineItem(Type.ADDED, twoList.get(0)));
        }
        if (twoList.isEmpty()) {
            lines.add(new LineItem(Type.REMOVED, oneList.get(0)));
        }
        lines.forEach(System.out::println);
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type + " " + line;
        }
    }
}