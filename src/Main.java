public class Main {
    public static void main(String[] args) {
        String personOS = "iOS";
        boolean clientOS = personOS == "iOS";
        if (clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        String os2 = "Android";
        short clientDeviceYear = 2014;
        boolean clientOS2 = os2 == "iOS";
        if (clientOS2 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (!clientOS2 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        short year = 2021;
        if (year < 1584) {
            System.out.println("Год должен быть больше, чем 1584");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        byte deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("Доставка не доступна");
        } else if (deliveryDistance > 60) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance > 20) {
            System.out.println("Потребуется дней: 2");
        } else {
            System.out.println("Потребуется дней: 1");
        }

        byte monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некоректный номер месяца");
        }
    }
}