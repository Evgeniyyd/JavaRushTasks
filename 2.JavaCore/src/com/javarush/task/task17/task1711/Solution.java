package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person = null;
        if (args[0].equals("-c")) {
            for (int i = 1; i < args.length; i += 3) {
                String name = args[i];
                String sex = args[i + 1];
                Date date = dateFormat.parse(args[i + 2]);
                if (sex.equalsIgnoreCase("M")) {
                    person = Person.createMale(name, date);
                } else if (sex.equalsIgnoreCase("Ж")) {
                    person = Person.createFemale(name, date);
                }
                allPeople.add(person);
                int index = allPeople.indexOf(person);
                System.out.println(index);
            }
        } else if (args[0].equals("-u")) {
            for (int i = 1; i < args.length; i+=4) {
                String id = args[i];
                String name = args[i=1];
                String sex = args[i+2];
                Date date = dateFormat.parse(args[i + 3]);
                int index = Integer.parseInt(id);
                if (index >=0 && index < allPeople.size()){
                    if (sex.equalsIgnoreCase("Ж")){
                       person = Person.createFemale(name, date);

                    } else if (sex.equalsIgnoreCase("M")) {
                       person = Person.createMale(name, date);
                    }
                    allPeople.set(index,person);



                }
            }

        }

    }
}
