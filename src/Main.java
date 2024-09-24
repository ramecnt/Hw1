import java.time.LocalDate;

public class Main {
    public static void isLeapOrNot(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void osUpdate(boolean isIos, int year) {
        String os;
        if (isIos) {
            os = "iOS";
        } else {
            os = "Android";
        }
        int currentYear = LocalDate.now().getYear();
        if (currentYear > year) {
            System.out.println("Установите облегченную версию приложения для " + os + " по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для " + os + " по ссылке");
        }
    }

    public static int deliveryDays(int distance) {
        int result = 0;
        if (distance < 20) {
            result += 1;
        } else if (distance < 60) {
            result += 2;
        } else if (distance < 100) {
            result += 3;
        } else {
            result = -1;
        }
        return result;
    }
}