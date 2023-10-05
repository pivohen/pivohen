package lab4;


//Для произвольной цифры от 0 до 9 вывести на консоль ее значение прописью.
// Например, для цифры 9 на консоли должна быть напечатана строка «Девять».


import java.util.Random;

public class zad1 {
    public static void main(String args[]) {
        Random random = new Random(); //генерация рандомного числа
        int z = random.nextInt(10);  // дает рандомное число от 0 до 9



        switch (z) {  //оператор с условиями
            case 0 -> System.out.println(z+ "-" + "Ноль");
            case 1 -> System.out.println(z+ "-" + "Один");
            case 2 -> System.out.println(z+ "-" + "Два");
            case 3 -> System.out.println(z+ "-" + "Три");
            case 4 -> System.out.println(z+ "-" + "Четыре");
            case 5 -> System.out.println(z+ "-" + "Пять");
            case 6 -> System.out.println(z+ "-" + "шесть");
            case 7 -> System.out.println(z+ "-" + "Семь");
            case 8 -> System.out.println(z+ "-" + "Восемь");
            case 9 -> System.out.println(z+ "-" + "Девять");
            default -> System.err.println("Ошибка. Введите число от 0 до 9");
        }


    }

    public String toString(int z) {
        if (z == 0) {
            System.out.println("Ноль");

        } else if (z == 1) {
            System.out.println("Один");

        } else if (z == 2) {
            System.out.println("Два");

        } else if (z == 3) {
            System.out.println("Три");

        } else if (z == 4) {
            System.out.println("Четыре");

        } else if (z == 5) {
            System.out.println("Пять");

        } else if (z == 6) {
            System.out.println("Шесть");

        } else if (z == 7) {
            System.out.println("Семь");

        } else if (z == 8) {
            System.out.println("Восемь");

        } else if (z == 9) {
            System.out.println("Девять");
        } else {
            System.out.println("Ошибка. Введите число от 0 до 9");
        }
        return null;
    }
}