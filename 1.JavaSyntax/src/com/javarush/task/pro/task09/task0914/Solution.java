package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int indexOf = path.indexOf("jdk");
        String string = path.substring(0,indexOf);
        int indexOf1 = path.indexOf("/", indexOf);
        String string1 = path.substring(indexOf1);

        return string + jdk + string1;
    }

}
