public class Main {
    public static void main(String[] args) {
        tast1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
    }
    public static void tast1 () {
        System.out.println("Задача1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версия приложения для IOS по ссылке");
        } else if (clientOS ==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2 () {
        System.out.println("Задача2");
        int clientOS = 1;
        int clientDeviceYear = 2010;
        if (clientOS == 0) {
          if (clientDeviceYear < 2015) {
              System.out.println("Установите облегченную версия приложения для IOS по ссылке");
          } else
              System.out.println("Установите версия приложения для IOS по ссылке");
        }
        else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версия приложения для Android по ссылке");
            } else
                System.out.println("Установите версия приложения для Android по ссылке");
        }
    }
    public static void task3 () {
        System.out.println("Задача3");
        int year = 2020;
        if (year % 4 ==0) {
            if (year % 100 != 0 || year % 400 ==0) {
                System.out.println("високостный год");
            }
            }
        else  {
            System.out.println("не високостный год");
        }
    }
    public static void task4 () {
        System.out.println("Задача4");
        int deliveryDistance = 56;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется одни сутки");
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется два дня");
        }
        else if (deliveryDistance >=60 && deliveryDistance < 100) {
            System.out.println("Потребуется три дня");
        }
        else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("нет номера месяца больше 12");
        }
    }
}