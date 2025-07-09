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
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = null;
        if (args[0].equals("-c")) {
            if (args[2].equalsIgnoreCase("М")) {
                person = Person.createMale(args[1], dateFormat.parse(args[3]));
                allPeople.add(person);
            } else if (args[2].equalsIgnoreCase("Ж")) {
                person = Person.createFemale(args[1], dateFormat.parse(args[3]));
                allPeople.add(person);
            }
            System.out.println(allPeople.indexOf(person));
        } else if (args[0].equals("-r")) {
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()) {
                person = allPeople.get(id);
                String name = person.getName();
                Sex sex = person.getSex();
                Date birthDate = person.getBirthDate();
                String floor = null;
                if (sex.equals(Sex.MALE)) {
                    floor = "м";
                } else if (sex.equals(Sex.FEMALE)) {
                    floor = "ж";
                }
                System.out.println(name + " " + floor + " " + simpleDate.format(birthDate));
            }
        } else if (args[0].equals("-u")) {
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()) {
                person = allPeople.get(id);
                person.setName(args[2]);
                if (args[3].equalsIgnoreCase("М")) {
                    person.setSex(Sex.MALE);
                } else if (args[3].equalsIgnoreCase("Ж")) {
                    person.setSex(Sex.FEMALE);
                }
                person.setBirthDate(dateFormat.parse(args[4]));
            }
        } else if (args[0].equals("-d")) {
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()) {
                person = allPeople.get(id);
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
            }

        }
    }
}



