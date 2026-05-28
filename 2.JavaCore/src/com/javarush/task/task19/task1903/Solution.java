package com.javarush.task.task19.task1903;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;

/* 
Адаптация нескольких интерфейсов
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        public IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            StringBuilder builder = new StringBuilder();
            builder.append(data.getPhoneNumber());
            while (builder.length() < 10) {
                builder.insert(0, "0");
            }
            String string = builder.toString();
            String substring0 = string.substring(0, 3);
            String substring1 = string.substring(3, 6);
            String substring2 = string.substring(6, 8);
            String substring3 = string.substring(8);


            return "+" + data.getCountryPhoneCode() +
                    "(" +
                    substring0+")" +
                    substring1+"-" +
                    substring2+"-"+
                    substring3;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {

            return countries.get(data.getCountryCode());
        }
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }
}