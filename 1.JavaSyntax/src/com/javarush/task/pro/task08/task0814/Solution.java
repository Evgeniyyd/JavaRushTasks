package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        int i = number | (1 << flagPos);
        return i;
    }

    public static int resetFlag(int number, int flagPos) {
        int mask = ~(1 << flagPos);
        int b = number & mask;
        return b;
    }

    public static boolean checkFlag(int number, int flagPos) {
if ((number & (1 << flagPos)) == (1 << flagPos)){
            return true;
        }
            return false;
        }
    }

