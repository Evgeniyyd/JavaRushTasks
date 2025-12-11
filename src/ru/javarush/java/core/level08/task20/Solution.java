package ru.javarush.java.core.level08.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаём новую запись об ученике
        SchoolStudent newPupil = new SchoolStudent();
        // Имя можно присвоить напрямую — поле публичное
        newPupil.studentName = "Мария";
        newPupil.setStudentAge(18);
        // Возраст задаётся только через публичный метод (инкапсуляция)

        newPupil.displayStudentProfile();

        // Выведем аккуратный профиль ученика

       newPupil.studentAge =20;
        // Попытка прямого изменения приватного поля — это нарушение инкапсуляции.

    }
}

// Класс описывает ученика школы
class SchoolStudent {
    public String studentName;
    // Имя ученика доступно всем — публичное поле
    private  int studentAge;
    // Возраст ученика — чувствительная информация, скрытая от прямого доступа

      public void setStudentAge(int ageToSet){
          this.studentAge = ageToSet;
      }
      public void displayStudentProfile(){
          System.out.println("Имя: "+ studentName +" возраст: "+ studentAge);
      }
    // Публичный метод позволяет корректно установить возраст


    // Аккуратно выводим профиль ученика

}