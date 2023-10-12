package lab5;

//Дан массив из целых чисел B(n), где n=1,25.
// Необходимо упорядочить массив по возрастанию.

import java.util.Arrays;

    public class zad2 {
        public static void main(String[] args) {
            int[] array = new int[]{4, 2, 6, 1, 9, 3, 5, 8, 7, 10, 15, 12, 13, 11, 14, 18, 17, 20, 19, 16, 23, 22, 21, 25, 24};

            Arrays.sort(array); // Сортируем массив по возрастанию

            // Выводим отсортированный массив
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }


