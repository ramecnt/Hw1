public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 18; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > -11; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1904; i < 2097; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 7; i < 99; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();

        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 += 29000;
            total2 *= 1.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }

        for (int i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + (i * 2));
        }
    }
}