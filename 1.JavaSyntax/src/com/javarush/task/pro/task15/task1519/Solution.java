package com.javarush.task.pro.task15.task1519;



import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.Scanner;

/* 
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDirectory)) {
            for (Path newPath : directoryStream) {
                if (Files.isRegularFile(newPath)) {
                 Path fileName =  newPath.getFileName();
                    Path resultPath = targetDirectory.resolve(fileName);
                    Files.copy(newPath, resultPath);
                }
            }
        } catch (Exception e) {
            System.out.println();
        }
    }
}





