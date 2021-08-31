package ru.vsokolov.lesson04_exceptions.task_1;

// NotEnoughOfMoneyException - Не достаточно Денег на счёте

public class NotEnoughOfMoneyException extends Exception{
    public NotEnoughOfMoneyException(String message) {
        super(message + "\n Введите сумму меньше или равную остатку денег на Вашем счёте");
    }


}
