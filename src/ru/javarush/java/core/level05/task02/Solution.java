package ru.javarush.java.core.level05.task02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int secretKeyCandidate = console.nextInt();

        if (secretKeyCandidate <= 1) {
            System.out.println("NO");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= secretKeyCandidate / i; i++) {
            if (secretKeyCandidate % i == 0) {

                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
