package ru.javarush.java.core.level14.task08;

public class Solution {
    public static class BankAccount {
        String accountOwner;
        int accountBalance;

        public BankAccount(String accountOwner, int accountBalance) {
            this.accountOwner = accountOwner;
            this.accountBalance = accountBalance;
        }

        public BankAccount(String accountOwner) {
            this.accountOwner = accountOwner;
        }

        public void deposit( int amount) {
            accountBalance += amount;
        }

        public void printInfo() {
            System.out.println("Владелец: " + accountOwner + ", баланс: " + accountBalance);
        }
    }

    public static void main(String[] args) {
        // Открываем счёт с заданным начальным балансом
        BankAccount account = new BankAccount("Николай", 300);
        //account.deposit(account.accountBalance++);
      BankAccount bankAccount = new BankAccount("Валентин");
      //  account1.deposit(account1.accountBalance++);


        // Открываем счёт только с именем (баланс будет установлен в 0)
        account.deposit(0);
        bankAccount.deposit(500);
        // Пополняем второй счёт на 500 единиц
        bankAccount.printInfo();
        account.printInfo();

        // Выводим информацию о каждом счёте

    }
}

// Класс банковского счёта с владельцем и текущим балансом