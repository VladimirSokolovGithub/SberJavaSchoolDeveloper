package ru.vsokolov.lesson04_exceptions.task_1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PinValidator {

    public int pinValidation() {
        Scanner scanner = new Scanner(System.in);

        int inputPin;
        int f = 1, result = 0;
        int[] pinArray = new int[4];

        System.out.println("Добро пожаловать в банкомат");
        do {
            System.out.println("Пожалуйста, введите ваш пин код:");
            for (int j = 0; j < pinArray.length; j++) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Вы ввели неверный символ, повторите ввод");
                    scanner.next();
                }
                inputPin = scanner.nextInt();
                pinArray[j] = inputPin;
            }
        } while (pinArray[3] == 0);
//            scanner.close();

//        int result = 0;
//        for (int i = pinArray.length - 1, n = 0; i >= 0; --i, n++) {
//            int pos = (int) Math.pow(10, i);
//            result += pinArray[n] * pos;
//        }
//        System.out.println(result);

        for (int k = pinArray.length - 1; k >= 0; k--) {
            result += (pinArray[k] * f);
            f = f * 10;
        }
        System.out.println(result);

        return result;
    }


    public void checkingThePinInputAttempt(PinValidator pinValidator, ClientAccount clientAccount) {
        for (int i = 1; i <= 3; i++) {
            if (pinValidator.pinValidation() == clientAccount.getPin()) {
                clientAccount.setAccountIsAvailable(true);
                System.out.println("Поздравляем пин код верный");
                System.out.println(clientAccount.isAccountIsAvailable());

                break;
            } else {
                if (i <= 2) {
                    System.out.println("Извините, пин код неверный, у вас все еще есть " + (3 - i) + "попыток");

                } else {
//                    throw new AccountIsLockedException("Извините, ваша карта заблокирована на 10 секунд!");
                    System.out.println("Извините, ваша карта заблокирована на 10 секунд2!");
                    System.out.println("Повторите ввод пин кода после разблокировки аккаунта");
                    clientAccount.setAccountIsAvailable(false);
                    System.out.println(clientAccount.isAccountIsAvailable());
                    try {
                        blockerCard(clientAccount);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;

                }

            }

        }
//        return clientAccount.isAccountIsAvailable();
    }

    public void blockerCard(ClientAccount clientAccount) throws InterruptedException {

        long displayMinutes = 0;
        long startTime = System.currentTimeMillis();
        System.out.println("Timer:");
        while (!clientAccount.isAccountIsAvailable()) {
            TimeUnit.SECONDS.sleep(1);
            long timePassed = System.currentTimeMillis() - startTime;
            long secondsPassed = timePassed / 1000;
            System.out.println(displayMinutes + ":" + secondsPassed);
            if (secondsPassed == clientAccount.getTimer()) {
                clientAccount.setAccountIsAvailable(true);
                System.out.println("Ваша карта разблокирована");
                System.out.println(clientAccount.isAccountIsAvailable());
                checkingThePinInputAttempt(PinValidator.this, clientAccount);
            }

//            System.out.println(displayMinutes + ":" + secondsPassed);
        }

    }

}



