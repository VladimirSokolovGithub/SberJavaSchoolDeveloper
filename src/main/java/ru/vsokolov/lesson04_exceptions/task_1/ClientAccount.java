package ru.vsokolov.lesson04_exceptions.task_1;

public class ClientAccount {

    public int timer = 10;
    private double balance; // баланс клиента
    private int pin; //пин код клиента
    private boolean accountIsAvailable; //флажок блокировки счёта - разблокирован/заблокирован


    public ClientAccount(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getTimer() {
        return timer;
    }

    public void setAccountIsAvailable(boolean accountIsAvailable) {
        this.accountIsAvailable = accountIsAvailable;

    }

    public boolean isAccountIsAvailable() {

        return accountIsAvailable;
    }


}
