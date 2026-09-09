package com.javarush.task.task23.task2309;

import com.javarush.task.task23.task2309.vo.*;


import java.util.List;


/* 
Анонимность иногда так приятна!
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        print(solution.getUsers());
        print(solution.getLocations());
        print(solution.getServers());
        print(solution.getSubjects());
        print(solution.getSubscriptions());

    }

    public List<User> getUsers() {
        List<User> userSelectorExecutor = new AbstractDbSelectExecutor<User>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM USER";
            }

        }.execute();
        return userSelectorExecutor;
    }

    public List<Location> getLocations() {
        List<Location> locations = new AbstractDbSelectExecutor<Location>() {

            @Override
            public String getQuery() {
                return "SELECT * FROM LOCATION";
            }
        }.execute();
        return locations;
    }

    public List<Server> getServers() {
        List<Server> servers = new AbstractDbSelectExecutor<Server>() {

            @Override
            public String getQuery() {
                return "SELECT * FROM SERVER";
            }
        }.execute();
        return servers;
    }

    public List<Subject> getSubjects() {
        List<Subject> subjects = new AbstractDbSelectExecutor<Subject>() {

            @Override
            public String getQuery() {
                return "SELECT * FROM SUBJECT";
            }
        }.execute();
        return subjects;
    }

    public List<Subscription> getSubscriptions() {
        List<Subscription> subscriptions = new AbstractDbSelectExecutor<Subscription>() {

            @Override
            public String getQuery() {
                return "SELECT * FROM SUBSCRIPTION";
            }
        }.execute();
        return subscriptions;
    }


    public static void print(List list) {
        String format = "Id=%d, name='%s', description=%s";
        NamedItem item;
        for (Object obj : list) {
            item = (NamedItem) obj;
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }
}


