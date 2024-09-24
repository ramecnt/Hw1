public class Main {
    public static void main(String[] args) {
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 0.1f;
        double d = 1;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        float twentySeven = 27.12f;
        long aLot = 987678965549L;
        float two = 2.786f;
        short fiveHundred = 569;
        short minus = -159;
        short morePrevious = 27897;
        byte sixtySeven = 67;

        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + (paper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna)) + " листов бумаги");

        byte bottles = 16;
        byte perWhat = 2;
        byte perMinute = (byte) (bottles / perWhat);
        System.out.println("За 20 минут машина произвела " + (perMinute * 20) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (perMinute * 24 * 60) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (perMinute * 24 * 60 * 3) + " штук бутылок");
        System.out.println("За месяц минут машина произвела " + (perMinute * 24 * 60 * 30) + " штук бутылок");

        byte total = 120;
        byte whitePer = 2;
        byte brownPer = 4;
        byte perClass = (byte) (whitePer + brownPer);
        System.out.println("В школе, где " + (total / perClass) + " классов, нужно " + ((total / perClass) * whitePer) +
                " банок белой краски и " + ((total / perClass) * brownPer) + " банок коричневой краски");

        byte bananaAmount = 5;
        byte bananaWeight = 80;
        short milkAmount = 200;
        byte milkWeight = 105;
        byte iceCreamAmount = 2;
        byte iceCreamWeight = 100;
        byte eggAmount = 4;
        byte eggWeight = 70;
        short resGrams = (short) (bananaAmount * bananaWeight + milkAmount * milkWeight + iceCreamAmount * iceCreamWeight + eggAmount * eggWeight);
        float resKg = resGrams / (float) 1000;
        System.out.println("Gram - " + resGrams);
        System.out.println("Kg - " + resKg);

        short min = 250;
        short max = 500;
        short neededKg = 7;
        short neededGrams = (short) (neededKg * 1000);
        System.out.println("Если худеть на " + min + " грамм - " + (neededGrams / min));
        System.out.println("Если худеть на " + max + " грамм - " + (neededGrams / max));
        System.out.println("В среднем " + (((neededGrams / min) + (neededGrams / max)) / 2));

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int cristinaSalary = 76230;
        System.out.println("Маша теперь получает " + (int) (mashaSalary * 1.1) + " рублей. Годовой доход вырос на " + (int) (mashaSalary * 0.1 * 12) + " рублей");
        System.out.println("Денис теперь получает " + (int) (denisSalary * 1.1) + " рублей. Годовой доход вырос на " + (int) (denisSalary * 0.1 * 12) + " рублей");
        System.out.println("Кристина теперь получает " + (int) (cristinaSalary * 1.1) + " рублей. Годовой доход вырос на " + (int) (cristinaSalary * 0.1 * 12) + " рублей");
    }
}