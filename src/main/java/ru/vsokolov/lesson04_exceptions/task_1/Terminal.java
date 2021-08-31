package ru.vsokolov.lesson04_exceptions.task_1;

public interface Terminal {

    double checkPaymentAccount(); //Метод проверки состояния счета

    void getMoney(double money) throws NotEnoughOfMoneyException, IncorrectAmountOfMoneyException; //Метод получения денег со счета

    void putMoney(double money) throws IncorrectAmountOfMoneyException;//Метод внесения денег на счёт


}
