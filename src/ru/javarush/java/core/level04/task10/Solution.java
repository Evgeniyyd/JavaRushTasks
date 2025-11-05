package ru.javarush.java.core.level04.task10;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pincod;
        do {
            System.out.println("Ведите PIN-код");
            pincod = scanner.nextInt();


        } while (pincod < 1000 || pincod > 9999);

            System.out.println("PIN-код принят");
        }
    }

// Выводим сообщение о принятии PIN-кода

