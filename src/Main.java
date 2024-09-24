public class Main {
    public static void main(String[] args) {
        int[] mas = new int[3];
        mas[0] = 1;
        mas[1] = 2;
        mas[2] = 3;
        double[] mas2 = {1.57, 7.654, 9.986};
        int[] mas3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print(mas[0]);
        for (int i = 1; i < mas.length; i++) {
            System.out.print(", " + mas[i]);
        }
        System.out.println();
        System.out.print(mas2[0]);
        for (int i = 1; i < mas2.length; i++) {
            System.out.print(", " + mas2[i]);
        }
        System.out.println();
        System.out.print(mas3[0]);
        for (int i = 1; i < mas3.length; i++) {
            System.out.print(", " + mas3[i]);
        }
        System.out.println();

        System.out.print(mas[mas.length - 1]);
        for (int i = mas.length - 2; i > -1; i--) {
            System.out.print(", " + mas[i]);
        }
        System.out.println();
        System.out.print(mas2[mas2.length - 1]);
        for (int i = mas2.length - 2; i > -1; i--){
            System.out.print(", " + mas2[i]);
        }
        System.out.println();
        System.out.print(mas3[mas3.length - 1]);
        for (int i = mas3.length - 2; i > -1; i--) {
            System.out.print(", " + mas3[i]);
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 1) {
                mas[i] += 1;
            }
            System.out.print(mas[i] + " ");
        }
    }
}