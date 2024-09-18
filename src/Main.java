public class Main {
    public static void main(String[] args) {
        int total = 0;
        short i = 0;
        while (total < 2459000) {
            total *= 1.01;
            total += 15000;
            i += 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        i = 1;
        while (i != 11) {
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        int population = 12000000;
        double birthRate = population * 17 / 1000;
        double deathRate = population *  8 / 1000;
        for (i = 0; i < 11; i++) {
            population += birthRate;
            population -= deathRate;
            System.out.println("Год " + (i + 1) + ", численность населения составляет " + population);
        }

        int total2 = 15000;
        i = 1;
        while (total2 < 12000000) {
            total2 *= 1.07;
            System.out.println("Месяц " + i + ", на счете " + total2);
            i += 1;
        }

        total2 = 15000;
        i = 1;
        while (total2 < 12000000) {
            total2 *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", на счете " + total2);
            }
            i += 1;
        }

        total2 = 15000;
        i = 1;
        while (i <= 9 * 12) {
            total2 *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", на счете " + total2);
            }
            i += 1;
        }

        int friday = 3;

        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        } while (friday <= 31);

        int year = 2024;
        int yearBefore = year - 200;
        int yearAfter = year + 100;

        for (year = yearBefore; year <= yearAfter; year ++) {
            if (year % 79 == 0){
                System.out.println(year);
            }
        }
    }
}