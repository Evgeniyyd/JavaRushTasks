package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "kiev");
        map.put("age", null);
        String query = getQuery(map);
        System.out.println(query);

    }

    public static String getQuery(Map<String, String> params) {
        if (params == null || params.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            if (value != null) {
                builder.append(key).append(" =")
                        .append(" ").append("'")
                        .append(value).append("'")
                        .append(" ").append("and").append(" ");
            }
        }
        int indexOf = builder.lastIndexOf(" and");

        builder.delete(indexOf, builder.length());

        return builder.toString();
    }
}