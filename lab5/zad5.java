package lab5;

//Напишите программу, выводящую на консоль таблицу 3х5 случайных элементов (a(i,j)< 10).

    import java.util.Random;

    public class zad5 {
        public static void main(String[] args) {
            int[][] array = new int[3][5];
            Random random = new Random();

            // Заполняем таблицу случайными элементами от 0 до 10
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {

                    // Генерируем случайное число от 0 до 10
                    array[i][j] = random.nextInt(11);
                }
            }

            // Вывод таблицы на консоль
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
