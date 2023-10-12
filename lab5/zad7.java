package lab5;

//Даны 5 строк s1, s2, s3, s4 и s5, на основе условия: если строка s4 равна строке s5,
// нужно сложить строки s1 и s2, иначе нужно сложить строки s1 и s3.


import java.util.Arrays;

public class zad7 {


    public static void main(String[] args) { // Объявление массивов


    int[] s1 = {1, 2, 3};
    int[] s2 = {4, 5, 6};
    int[] s3 = {7, 8, 9};
    int[] s4 = {7, 8, 9};
    int[] s5 = {7, 8, 9};

    int[] result;


    if (Arrays.equals(s4, s5)) { // Сравнение строк
        result = new int[s1.length + s2.length]; // Сумма длины s1 и s2
        System.arraycopy(s1, 0, result, 0, s1.length);
        System.arraycopy(s2, 0, result, s1.length, s2.length);
    } else {
        result = new int[s1.length + s3.length]; // Сумма длины s1 и s2
        System.arraycopy(s1,0, result, 0, s1.length);
        System.arraycopy(s3, 0, result, s1.length, s3.length);
    }

    System.out.println("Результат: " + Arrays.toString(result)); // Вывод результата
}
}


