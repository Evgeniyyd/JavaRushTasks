package ru.javarush.java.core.level14.task14;

public class User {
    private  String userName;
    private  int userAge;

    public User(String userName) {
        this.userName = userName;
        this.userAge = 0;
    }

    public User() {
        this.userAge =0;
        this.userName = "Unknown";
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }
}
