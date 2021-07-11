package com.senla.course.tasks.task1;
import java.util.Scanner;

public class TripletsFinder {

    public static void main(String[] args) {
        System.out.println("Введите строку символов");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Количество  символов, появляющийся три раза подряд в строке " + getTriplets(str));
    }

    public static int getTriplets(String str) {
        char chars[] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i > 1) {
                if (chars[i] == chars[i - 1] && chars[i] == chars[i - 2]) {
                    i = i + 2;
                    count++;
                }
            }
        }
        return count;
    }
}

