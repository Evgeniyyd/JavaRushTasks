package com.javarush.task.task13.task1326;

import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try (FileInputStream fileInputStream = new FileInputStream(fileName); //читает данные в виде байтов
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); // делаем перевод с байтов на символы
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) { //потом передаём это в буфер для создания строк
            while (bufferedReader.ready()) { // создаём цыкл и считываем строки пока они есть
                String string = bufferedReader.readLine(); // считываем строки из буфера
                int number = Integer.parseInt(string);// делаем парсинг из строк в числа
                if (number % 2 == 0) { // делаем проверку на чётность
                    list.add(number); // добавляем все чётные числа в список
                }
            }
        }
       list.sort(Comparator.naturalOrder()); // потом делаем  сортировку списка от меньшего к большему
        list.forEach(System.out::println); // и выводим всё в консол по порядку используя лямбды-вырожения
    }
}
