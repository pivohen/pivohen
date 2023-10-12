package lab5;


//Дан массив из целых чисел A(n), где n=1,25.
// Необходимо поменять местами его максимальный и минимальный элемент.
public class zad1 {
    public static void main(String[] args) {
        int[] array = new int[]{25, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 1};

        //Находим индексы минимального и максимального элементов
        int minIndex = 0;
        int maxIndex = 0;
        int minValue = array[minIndex];
        int maxValue = array[maxIndex];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        //Меняем местами минимальный и максимальный элементы
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        //Вывод результата
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


























       /*int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        String temp = array[0];

        array[0] = array[24];
        array[24] = temp;

        System.out.println(array.toString(array));
    }
}
*/
