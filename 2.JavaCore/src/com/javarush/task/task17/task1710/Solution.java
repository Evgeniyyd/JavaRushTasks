package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person male = null;
        if (args[0].equals("-c")) {
            if (args[2].equalsIgnoreCase("М")) {
                male = Person.createMale(args[1], DateFormat.parse(args[3]));
                allPeople.add(male);
            } else if (args[2].equalsIgnoreCase("Ж")) {
                male = Person.createFemale(args[1], DateFormat.parse(args[3]));
                allPeople.add(male);
            }


            System.out.println(allPeople.indexOf(male));
        }
        if (args[0].equals("-r")){
            
        }
    }
}
