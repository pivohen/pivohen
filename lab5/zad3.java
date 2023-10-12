package lab5;


//Дан массив из целых чисел С(n), где n=1,20.
// Необходимо найти среднее значение и вывести его на консоль.

public class zad3 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 9, 4, 7, 1, 3, 8, 6, 10, 15, 12, 13, 11, 14, 18, 17, 20, 19, 16};


        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];   // Сумма всех элементы массива
        }


        double average = (double) sum / array.length;  // Вычисляем среднее значение


        System.out.println("Среднее значение: " + average); // Вывод среднего значения на консоль
    }
}

