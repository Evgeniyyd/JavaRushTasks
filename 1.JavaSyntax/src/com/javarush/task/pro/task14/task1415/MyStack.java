package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        return storage.remove(0);
    }

    public String peek() {
        String string = storage.get(0);
        return string;

    }

    public boolean empty() {
        Boolean string = storage.isEmpty();
        return string;
    }

    public int search(String s) {
        int index = storage.indexOf(s);
        if (storage.isEmpty()) {

        }
        return index;
    }

}

