package lab6;


//Вычисление платежей по кредиту
//Постановка задачи
//Напишите программу, которая вычисляет платежи по кредиту. Кредит может быть
//ипотечным, автомобильным, образовательным.
//Программа должна удовлетворять следующим требованиям:
//- Она должна позволять пользователю вводить ежегодную процентную ставку,
//сумму кредита и количество лет, в течение которых будут производиться
//платежи.
//- Она должна вычислять и отображать ежемесячный платеж и стоимость кредита
//по формулам:

import java.util.Scanner;

        public class zad2 {
            public static void main(String[] args) {
// Вводим данные от пользователя
                Scanner scanner = new Scanner(System.in);

                System.out.print("Введите тип кредита (1 - ипотечный, 2 - автомобильный, 3 - образовательный): ");
                int creditType = scanner.nextInt();

                System.out.print("Введите сумму кредита: ");
                double loanAmount = scanner.nextDouble();

                System.out.print("Введите ежегодную процентную ставку: ");
                double annualInterestRate = scanner.nextDouble();

                System.out.print("Введите срок кредита в годах: ");
                int loanTermInYears = scanner.nextInt();

// Вычисляем ежемесячную процентную ставку и срок кредита в месяцах
                double monthlyInterestRate = annualInterestRate / 100 / 12;
                int loanTermInMonths = loanTermInYears * 12;

// Вычисляем ежемесячный платеж и стоимость кредита
                double monthlyPayment = calculateMonthlyPayment(creditType, loanAmount, monthlyInterestRate, loanTermInMonths);
                double totalCost = calculateTotalCost(monthlyPayment, loanTermInMonths);

                System.out.println("Ежемесячный платеж: " + monthlyPayment);// Выводим результаты
                System.out.println("Стоимость кредита: " + totalCost);
            }

            public static double calculateMonthlyPayment(int creditType, double loanAmount, double monthlyInterestRate, int loanTermInMonths) {
                double monthlyPayment;
                if (creditType == 1) { // Ипотечный кредит
                    monthlyPayment = loanAmount * monthlyInterestRate /
                            (1 - Math.pow(1 + monthlyInterestRate, -loanTermInMonths));
                } else if (creditType == 2) { // Автомобильный кредит
                    monthlyPayment = (loanAmount + loanAmount * monthlyInterestRate * loanTermInMonths) /
                            loanTermInMonths;
                } else if (creditType == 3) { // Образовательный кредит
                    monthlyPayment = loanAmount / loanTermInMonths;
                } else {
                    throw new IllegalArgumentException("Неправильный тип кредита");
                }
                return monthlyPayment;
            }

            public static double calculateTotalCost(double monthlyPayment, int loanTermInMonths) {
                return monthlyPayment * loanTermInMonths;
            }
        }
