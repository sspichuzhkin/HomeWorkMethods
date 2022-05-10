package pro.sky;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1(2021);
        task2(0, 2022);
        task3(95);
    }

    private static void task1(int year) {
        boolean leapYear = checkYearForLeap(year);
        printCheckYearForLeapResult(year, leapYear);
    }

    private static boolean checkYearForLeap(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    private static void printCheckYearForLeapResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void task2(int deviceOS, int deviceYear) {
        boolean checkIsDeviceOldResult = checkIsDeviceOld(deviceYear);
        if (checkIsDeviceOldResult) {
            printInstallationMessageForOld(deviceOS);
        } else {
            printInstallationMessageForFresh(deviceOS);
        }
    }

    private static boolean checkIsDeviceOld(int deviceYear) {
        return (deviceYear < LocalDate.now().getYear());
    }

    private static void printInstallationMessageForOld(int deviceOS) {
        if (deviceOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (deviceOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Ограничение: OS не поддерживается!");
        }
    }

    private static void printInstallationMessageForFresh(int deviceOS) {
        if (deviceOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (deviceOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ограничение: OS не поддерживается!");
        }
    }

    private static void task3(int deliveryDistance) {
        calculateDeliveryTime(deliveryDistance);
    }

    private static void calculateDeliveryTime(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Ограничение: Обратитесь на горячую линию для индивидуального расчета доставки");
        }
    }

}