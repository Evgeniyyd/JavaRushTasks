package ru.javarush.java.core.level15.task11;

public class SmartLamp {
    private boolean isCurrentlyOn = false;

    public void setCurrentlyOn(boolean newState) {
        isCurrentlyOn = newState;
    }

    public boolean isCurrentlyOn() {
        return isCurrentlyOn;
    }
}
