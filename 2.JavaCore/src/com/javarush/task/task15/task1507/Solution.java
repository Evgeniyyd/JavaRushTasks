package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/
public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int a, String string) {
        int b = 0;
        for (int i = 0; i < b; i++) {
            int index = string.indexOf(a);
            System.out.println(index);
        }
        System.out.println();
    }

    public static void printMatrix(String str, String value) {
        for (int i = 0; i < str.length(); i++) {
            if (str.length() > value.length()) {
                System.out.println("ошибка");
            }
        }
    }

    public static void printMatrix(double b, double a) {
        if (b > a) {
            System.out.println(b);
        } else
            System.out.println(a);
    }

    public static void printMatrix(char cars, String str, int index) {
        String substring = str.substring(cars, index);
        System.out.println(substring);
    }

    public static void printMatrix(String str) {
        for (int i = 0; i < str.length(); i++) {
            int index = str.indexOf(str);
            String substring = str.substring(index);
            System.out.println(substring);
        }

    }

    public static void printMatrix(int num, Object sum) {
        String str = "Я дома";
        for (int i = 0; i < str.length(); i++) {
            if (str.equals(sum)) {
                int index = str.indexOf(num);
                char charAt = str.charAt(index);
                System.out.println(charAt);
            }
            System.out.println();
        }
    }
    public static void printMatrix(Object value, char chars){
        for (int i = 0; i < chars; i++)
            System.out.println(value);
    }
 public  static void printMatrix(double doubles){
     for (int i = 0; i < doubles; i++) {
     }
     System.out.println(doubles);

 }
}
