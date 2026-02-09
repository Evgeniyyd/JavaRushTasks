package ru.javarush.java.core.level15.task03;

public class Person {
    private  String memberName;
    private int memberAge;

    public Person(String memberName, int memberAge) {
        this.memberName =memberName;
        this.memberAge = memberAge;
    }

    public void getNewName(String memberName) {
         this.memberName = memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberAge(int memberAge) {
        if (memberAge < 0) {
            System.out.println("Ошибка: Возраст не может быть отрицательным. Значение не изменено.");
        }else {
            this.memberAge =memberAge;
        }
    }
    public int getMemberAge() {
        return memberAge;
    }
}
