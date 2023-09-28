package lab3;

/*
2. Вычислить выражение 1- 1/2 + 1/3 - 1/4 + ... + 1/9999 - 1/10000, используя оператор условия

 */

import java.util.Scanner;

public class zad2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //сканер для ввода с клавиатуры
        System.out.print("Введите число k ");
        int k = sc.nextInt();
        double res = 0, n = 1;

        for (int i = 1; i <= k; i++) {  // цикл для проверки всех значеий
            if (i % 2 == 0) { //условие, если делиться на 2 без остатка, то знак -, иначе +
                 res -=n/i;
            } else {
                 res +=n/i;
            }
        }
        System.out.print(res);
    }
}

