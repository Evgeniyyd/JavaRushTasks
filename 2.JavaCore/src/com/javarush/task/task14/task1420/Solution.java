package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();
        gsc(a,b);
    }
    public static void gsc(int a, int b){
        while (a !=0 && b!=0){
            if (a < b){
                a =a % b;
            }else
                b = b % a;
            break;
        }
        int tmp = b +a;
        System.out.println(tmp);
    }
    }

