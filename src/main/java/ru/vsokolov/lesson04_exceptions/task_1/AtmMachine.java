package ru.vsokolov.lesson04_exceptions.task_1;

public class AtmMachine implements Terminal { //class TerminalImpl из задания - моё название "ATM machine"

    private TerminalServer server;

    private PinValidator pinValidator;

    private ClientAccount clientAccount;

    public AtmMachine(TerminalServer server, PinValidator pinValidator, ClientAccount clientAccount) {
        this.server = server;
        this.pinValidator = pinValidator;
        this.clientAccount = clientAccount;
    }

//    public AtmMachine() {
//
//    }

    public TerminalServer getServer() {
        return server;
    }

//    public void setServer(TerminalServer server) {
//        this.server = server;
//    }

//    public void setPinValidator(PinValidator pinValidator) {
//        this.pinValidator = pinValidator;
//    }

    public ClientAccount getClientAccount() {
        return clientAccount;
    }

//    public void setClientAccount(ClientAccount clientAccount) {
//        this.clientAccount = clientAccount;
//    }

    public PinValidator getPinValidator() {
        return pinValidator;
    }


    @Override
    public double checkPaymentAccount() {
        return server.checkPaymentAccount();
    }

    @Override
    public void getMoney(double money) {

    }

    @Override
    public void putMoney(double money) {

    }


    public static void main(String[] args) {

        ClientAccount clientAccount = new ClientAccount(4500, 4545);
        TerminalServer terminalServer = new TerminalServer(clientAccount);
        PinValidator pinValidator = new PinValidator();
        pinValidator.checkingThePinInputAttempt(pinValidator, clientAccount);
        System.out.println(clientAccount.getBalance());

        try {
            terminalServer.getMoney(5000);
        } catch (NotEnoughOfMoneyException e) {
            e.printStackTrace();
        } catch (IncorrectAmountOfMoneyException e) {
            e.printStackTrace();
        }

        try {
            terminalServer.putMoney(600);
        } catch (IncorrectAmountOfMoneyException e) {
            e.printStackTrace();
        }

    }

}
