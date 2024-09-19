public class Main {
    public static void main(String[] args) {
        int[] mas = {100, 200, 300, 433, 23};
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей\n", sum);

        int max = 0, min = 1000000;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей\nМаксимальная сумма трат за неделю составила %s рублей\n", min, max);

        System.out.printf("Средняя сумма трат за месяц составила %s рублей\n", (float) sum / mas.length);

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}