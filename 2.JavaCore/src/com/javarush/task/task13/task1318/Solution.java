package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>(); //создание списка для хранения строк
        Scanner scanner = new Scanner(System.in); //создаём сканер   для вывода в консоль
        String fileName = scanner.nextLine(); //считываем данные с консоли
        try (FileInputStream fileInputStream = new FileInputStream(fileName); //читаем данные в байтах
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);// делаем перевод с байтов в символы
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) { // передаём  в буфер символы для формирование строк

            while (bufferedReader.ready()) {// создаём цыкл для считывания из файла пока там есть строки
                String string = bufferedReader.readLine(); //считываем строки
                arrayList.add(string); //складываем строки в список
            }
            arrayList.forEach(System.out::println); //делаем вывод содержимово списка
        }
    }
}
