package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = bufferedReader.readLine();
            if (line.equals(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
            } else if (line.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            } else if (line.equals(Planet.SUN)) {
                thePlanet = Sun.getInstance();
            }else
                thePlanet = null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
