package ru.vsokolov.lesson04_exceptions.task_1;

public class TerminalServer implements Terminal {

    ClientAccount clientAccount;

    public TerminalServer(ClientAccount clientAccount) {
        this.clientAccount = clientAccount;
    }


    @Override
    public double checkPaymentAccount() {
        return clientAccount.getBalance();
    }


    @Override
    public void getMoney(double money) throws NotEnoughOfMoneyException, IncorrectAmountOfMoneyException {
        if (money % 100 == 0) {
            if (clientAccount.getBalance() >= money) {
                clientAccount.setBalance(clientAccount.getBalance() - money);
                System.out.println("Вы сняли - " + money + " рублей");
                System.out.println("Остаток на счёте - " + clientAccount.getBalance());
            } else {
                throw new NotEnoughOfMoneyException("На Вашем счёте недостаточно средств");
            }
        } else {
            throw new IncorrectAmountOfMoneyException("Некорректная сумма");
        }
//        return clientAccount.getBalance();
    }

    @Override
    public void putMoney(double money) throws IncorrectAmountOfMoneyException {
        if (money % 100 == 0) {
            clientAccount.setBalance(clientAccount.getBalance() + money);
            System.out.println("Вы внесли на счёт - " + money + " рублей");
            System.out.println("Остаток на счёте - " + clientAccount.getBalance());
        } else {
            throw new IncorrectAmountOfMoneyException("Некорректная сумма");
        }
    }

}
