package ru.javarush.java.core.level05.task14;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Стартовые очки здоровья
        int knightHp = 100;
        int dragonHp = 50;

        // Дракон загадывает скрытый максимум удара 2..20
        Random rand = new Random();
        int dragonMax = rand.nextInt(19) + 2;

        // Ввод силы удара рыцаря
        Scanner console = new Scanner(System.in);
        System.out.println("Битва началась! У рыцаря 100 жизней, у дракона 50 жизней.");

        // Основной боевой цикл
        while (true) {
            System.out.println("Введите число от 1 до 20: ");
            int impactForce = console.nextInt();
            if (impactForce > dragonMax) {
                impactForce = 0;
            } else
                dragonHp -= impactForce;
            // Проверяем смерть дракона
            if (dragonHp <= 0) {
                System.out.println("Рыцарь победил!");
                break;
            }
            knightHp -= rand.nextInt(10) + 1;
            // Ход дракона: первая голова атакует
            knightHp -= rand.nextInt(10) + 1;
            System.out.println("Жизни рыцаря: " + knightHp + "\n" + "Жизни дракона: " + dragonHp);
            // Ход дракона: вторая голова атакует
            if (knightHp <= 0) {
                System.out.println("Дракон победил!");
                break;
            }
            // Текущий статус и проверка смерти рыцаря
        }
    }
}