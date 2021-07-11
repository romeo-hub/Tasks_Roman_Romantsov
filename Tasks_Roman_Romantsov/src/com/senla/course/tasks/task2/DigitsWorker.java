package com.senla.course.tasks.task2;

import java.util.Scanner;

public class DigitsWorker {

    public static void main(String[] args) {
        System.out.println("Введите строку символов");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Сумма цифр в строке " + getSumOfDigitsInString(str));
    }

    public static int getSumOfDigitsInString(String str) {
        char chars[] = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                sum += Integer.parseInt("" + chars[i]);
            }
        }
        return sum;
    }
}

