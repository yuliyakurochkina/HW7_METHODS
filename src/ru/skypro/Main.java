package ru.skypro;

public class Main {
    //Задание1
    public static void checkYear(int currentYear) {
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.println(currentYear + " год является високосным.");
        } else {
            System.out.println(currentYear + " год не является високосным.");
        }
    }

    //Задание2
    public static void definitionOfOS(int clientDeviceYear, int clientOS) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    //Задание3
    public static void bankCardDelivery(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Срок доставки уточняйте у оператора.");
        }
    }

    //Задание4
    public static void searchForDuplicates(String sortedString) {
        char[] ch = sortedString.toCharArray();
        outer:
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    System.out.println("Внимание! Найден дубль - это " + ch[i] + ".");
                    break outer;
                }
            }
        }
        System.out.println("Сканирование завершено.");
    }

    public static void main(String[] args) {
        //Задание1
        checkYear(1996);
        //Задание2
        definitionOfOS(2022, 0);
        //Задание3
        bankCardDelivery(58);
        //Задание4
        searchForDuplicates("aabccddefgghiijjkk");
    }
}

