public class Main {
    public static void main(String[] args) {
        byte age = 17;

        System.out.println("Если возраст человека равен " + age + ", то");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }


        byte coldWeather = -10;

        System.out.println("На улице " + coldWeather + " градусов");
        if (coldWeather < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }


        byte highSpeed = 120;

        System.out.println("Если скорость " + highSpeed + ", то");
        if (highSpeed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }


        byte age2 = 1;

        System.out.println("Если человеку " + age2);
        if (age2 < 2) {
            System.out.println("то ему никуда не нужно");
        } else if (age2 >= 2 && age2 <= 6) {
            System.out.println("то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("то его место в университете");
        } else if (age2 > 24) {
            System.out.println("то ему пора ходить на работу");
        }


        byte age3 = 13;

        System.out.println("Если человеку " + age3);
        if (age3 <= 5) {
            System.out.println("то он не может кататься на аттракционе");
        } else if (age3 > 5 && age3 <= 14) {
            System.out.println("то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("то он может кататься без сопровождения взрослого.");
        }

        byte amount = 102;
        byte sit = 60;
        byte people = 80;

        if (people >= amount) {
            System.out.println("В вагоне больше нет мест");
        } else if (people >= sit) {
            System.out.println("В вагоне нет сидячих мест, но есть стоячие");
        } else {
            System.out.println("В вагоне есть как стоячие, так и сидячие места");
        }

        int one = 1;
        int two = 2;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println("one самое большое число");
        } else if (two >= three && two >= one) {
            System.out.println("two самое большое число");
        } else if (three >= one && three >= two) {
            System.out.println("three самое большое число");
        }
    }
}