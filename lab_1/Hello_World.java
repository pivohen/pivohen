package lab_1;

import java.util.Scanner;

public class Hello_World {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введит6е число 1: ");
        Double ch1 = scanner. nextDouble();
        System.out.println("Введит6е число 2: ");
        Double ch2 = scanner. nextDouble();

        System.out.println("Сумма = " + sum(ch1, ch2 ));
    }
    public static double sum(double ch1, double ch2) {
        return ch1 + ch2;

    }

        public static double sum2(int ch1, int ch2) {
        return ch1 + ch2;
    }
}
