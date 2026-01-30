package ru.javarush.java.core.level12.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения строк из консоли
        Scanner scanner = new Scanner(System.in);
        // Динамический список для хранения задач
        List<String> list = new ArrayList<>();
        while (true) {
            // Считываем строки до тех пор, пока не введена пустая строка
            String s = scanner.nextLine();
            if (s.equals("")) {
                break;
            } else {
                list.add(s);
            }
        }
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
        }
    }
    // читаем очередную задачу
    // пустая строка — сигнал завершения ввода
    // добавляем задачу в список
    // Выводим задачи в обратном порядке: от последней к первой

