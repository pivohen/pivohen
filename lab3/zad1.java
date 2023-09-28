package lab3;
/*1. Создайте приложение, которое покажет, что для выражения
a^n b^n = c^n (теорема Ферма) нет натуральных решений от 1 до 100 и n>2.
 Убедитесь, что есть решения для n=2, и выведите их в консоль.
 */

import java.util.Scanner;
public class zad1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // сканнер для ввода с клавиатуры
        System.out.print("Введите чсло от 1 до 100: ");
        int n = sc.nextInt();
        if (n < 0 || n > 100) {   //условия для того, чтобы взять числа в нужном диапазоне
            System.err.println("Решений нет");
        }

        for (int i = 1; i <= 100; i++) { // цикл для проверки всех значеий
            for (int j = 1; j <= 100; j++) {
                for (int k = 1; k <= 100; k++) {
                    double a = Math.pow(i, n); //возведение в степень
                    double b = Math.pow(j, n);
                    double c = Math.pow(k, n);
                    if (a + b == c) {
                        System.out.println(i + "^" + n + "+" + j + "^" + n + "=" + k + "^" + n); //вывод
                    }
                }
            }
        }
    }
}