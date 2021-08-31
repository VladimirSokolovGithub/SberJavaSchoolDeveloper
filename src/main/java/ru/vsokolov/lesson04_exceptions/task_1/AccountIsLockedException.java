package ru.vsokolov.lesson04_exceptions.task_1;

//AccountIsLockedException - Учетная запись заблокирована

public class AccountIsLockedException extends Exception {
    public AccountIsLockedException(String message) {
        super(message + "\n Повторите ввод пин кода после разблокировки аккаунта");
    }
}
