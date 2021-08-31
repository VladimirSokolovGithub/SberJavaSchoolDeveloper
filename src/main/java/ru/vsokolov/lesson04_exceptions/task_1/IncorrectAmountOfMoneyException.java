package ru.vsokolov.lesson04_exceptions.task_1;

//IncorrectAmountOfMoneyException - Неверная Сумма Денег должно быть кратно 100

public class IncorrectAmountOfMoneyException extends Exception{
    public IncorrectAmountOfMoneyException(String message) {
        super(message + "\n Введена неправильная сумма. Введите сумму кратную 100");
    }
}
