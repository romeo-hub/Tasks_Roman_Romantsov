package com.senla.course.tasks.task4;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculationPrimeFactors {

    private static final String EXCEPTION_MESSAGE = "Ошибка! Вы ввели не целое число";

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        double inputNumber = scanner.nextDouble();
            if ((inputNumber % 1) == 0) {
                System.out.println("Вы ввели целое число");
                int checkedNumber = (int) inputNumber;
                System.out.println(checkedNumber);
                ArrayList<Integer> list = getPrimeFactorsOfNumber(checkedNumber);
                System.out.println("Простые множители из которых состоит целое число: \n" + list);
            } else {
                System.out.println(EXCEPTION_MESSAGE);
            }
    }

    public static ArrayList<Integer> getPrimeFactorsOfNumber(int checkedNumber) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= checkedNumber; i++) {
            while (checkedNumber % i == 0) {
                list.add(i);
                checkedNumber /= i;
            }
        }
        return list;
    }
}
