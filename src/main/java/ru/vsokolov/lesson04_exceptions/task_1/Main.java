package ru.vsokolov.lesson04_exceptions.task_1;

public class Main {


    public static void main(String[] args) throws Exception {

//        int pin = 4545; // пин код
//        double balance = 1000;// баланс
//        boolean accountIsAvailable = true; // объявляем логическую переменную
//AtmMachine atmMachine = new AtmMachine();
        ClientAccount clientAccount = new ClientAccount(4500, 4545);
        PinValidator pinValidator = new PinValidator();
//        Blocker blocker = new Blocker(clientAccount);
//        pinValidator.pinValidation();
        pinValidator.checkingThePinInputAttempt(pinValidator, clientAccount);
//        pinValidator.blockerCard(clientAccount);
//        pinValidator.blockerCard(clientAccount);
//        blocker.run();
//        System.out.println(clientAccount.isAccountIsAvailable());


//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<Integer> list = new ArrayList<Integer>() ;
//
//        while (true)
//        {
//            String s = reader.readLine();
//            if (s.isEmpty()) break;
//            list.add(Integer.parseInt(s));
//        }

/*       Scanner scanner = new Scanner(System.in);
        int inputPin;
        int[] pinArray = new int[4];

        System.out.println("Добро пожаловать в банкомат");
        System.out.println("Пожалуйста, введите ваш пин код:");

        for (int j = 0; j < pinArray.length; j++) {
                inputPin = scanner.nextInt();
                while (!scanner.hasNextInt()) {
                    System.out.println("Вы ввели неверный символ");
//                    scanner.next();
                }
                pinArray[j] = inputPin;
        }
        scanner.close();

 */
//        try {
//            pinValidation();
//        } catch (InputMismatchException e) {
//            System.out.println("Вы ввели неверный символ");
//        } finally {
//
//        }


//        Scanner scanner = new Scanner(System.in);
//        int inputPin;
//        int[] pinArray = new int[4];
//
//        System.out.println("Добро пожаловать в банкомат");
//        System.out.println("Пожалуйста, введите ваш пин код:");
//
//        for (int j = 0; j < pinArray.length; j++) {
//            if (scanner.hasNextInt()) {
//                inputPin = scanner.nextInt();
//                pinArray[j] = inputPin;
//            } else {
//                System.out.println("Вы ввели неверный символ");
//                scanner.next();
//            }
//
//        }
//        scanner.close();

//          int f = 1, a = 0;
//        for(int i = pinArray.length-1; i >= 0; i--) {
//            a = a + (pinArray[i] * f);
//            f = f * 10;
//        }
//        System.out.println("The Number is: " + a);

//        int result = 0;
//
//        for (int i = pinArray.length - 1, n = 0; i >= 0; --i, n++) {
//            int pos = (int) Math.pow(10, i);
//            result += pinArray[n] * pos;
//        }
//        System.out.println(result);


        // проверяем пин код
//        public static boolean checkingThePinInputAttempt() {
//            for (int i = 1; i <= 3; i++) {
//                if (pinCode == pin) {
//                    accountIsAvailable = true;
//                    break;
//                } else {
//                    if (i <= 2) {
//                        System.out.println("Извините, пароль неверный, у вас все еще есть " + (3 - i) + "попыток");
//                    } else {
//                        System.out.println("Извините, ваша карта заблокирована!");
//                        break;
//                    }
//                    accountIsAvailable = false;
//                }
//            }
//            return accountIsAvailable;
//        }





    }

    //*************РАБОЧИЙ МЕТОД
//    public static void pinValidation() {
//        Scanner scanner = new Scanner(System.in);
//        int inputPin;
//        int[] pinArray = new int[4];
//
//        System.out.println("Добро пожаловать в банкомат");
//
//
////        for (int j = 0; j < pinArray.length; j++) {
////            if (scanner.hasNextInt()) {
////                inputPin = scanner.nextInt();
////                pinArray[j] = inputPin;
////            } else {
////                System.out.println("Вы ввели неверный символ, повторите ввод");
////                scanner.next();
////            }
//        do {
//            System.out.println("Пожалуйста, введите ваш пин код:");
//            for (int j = 0; j < pinArray.length; j++) {
//
//                while (!scanner.hasNextInt()) {
//                    System.out.println("Вы ввели неверный символ, повторите ввод");
//                    scanner.next();
//                }
//                inputPin = scanner.nextInt();
//                pinArray[j] = inputPin;
//            }
//        } while (pinArray[3] == 0);
//
//        int result = 0;
//
//        for (int i = pinArray.length - 1, n = 0; i >= 0; --i, n++) {
//            int pos = (int) Math.pow(10, i);
//            result += pinArray[n] * pos;
//        }
//        System.out.println(result);
//    }



}

