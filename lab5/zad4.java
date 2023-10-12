package lab5;


//Дан массив из целых чисел D(n), где n=1,30.
// Посчитайте сумму четных и нечетных элементов массива.

public class zad4 {
        public static void main(String[] args) {
            int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            int sumEven = 0; // Сумма четных элементов
            int sumOdd = 0; // Сумма нечетных элементов

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    sumEven += array[i]; // Если элемент четный, добавляем его к сумме четных элементов
                } else {
                    sumOdd += array[i]; // Если элемент нечетный, добавляем его к сумме нечетных элементов
                }
            }

            System.out.println("Сумма четных элементов: " + sumEven);
            System.out.println("Сумма нечетных элементов: " + sumOdd);
        }
    }

