package com.senla.course.tasks.task6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FormatNumbers {

    public static void main(String[] args) {
        FormatNumbers banner = new FormatNumbers();
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        banner.printText(Integer.toString(number));
    }

    private Map<Character, char[][]> charMap;

    public FormatNumbers() {

        char[][] digit0 = {
                {' ', '0', '0', '0', ' '},
                {' ', '0', ' ', '0', ' '},
                {' ', '0', ' ', '0', ' '},
                {' ', '0', ' ', '0', ' '},
                {' ', '0', ' ', '0', ' '},
                {' ', '0', ' ', '0', ' '},
                {' ', '0', ' ', '0', ' '},
                {' ', '0', '0', '0', ' '}
        };

        char[][] digit1 = {
                {' ', ' ', '1', ' ', ' '},
                {' ', '1', '1', ' ', ' '},
                {' ', ' ', '1', ' ', ' '},
                {' ', ' ', '1', ' ', ' '},
                {' ', ' ', '1', ' ', ' '},
                {' ', ' ', '1', ' ', ' '},
                {' ', ' ', '1', ' ', ' '},
                {' ', ' ', '1', ' ', ' '}
        };

        char[][] digit2 = {
                {' ', '2', '2', '2', ' '},
                {' ', '2', ' ', '2', ' '},
                {' ', ' ', ' ', '2', ' '},
                {' ', ' ', ' ', '2', ' '},
                {' ', ' ', '2', ' ', ' '},
                {' ', '2', ' ', ' ', ' '},
                {' ', '2', ' ', ' ', ' '},
                {' ', '2', '2', '2', ' '}
        };

        char[][] digit3 = {
                {' ', '3', '3', '3', ' '},
                {' ', ' ', ' ', '3', ' '},
                {' ', ' ', ' ', '3', ' '},
                {' ', '3', '3', ' ', ' '},
                {' ', ' ', ' ', '3', ' '},
                {' ', ' ', ' ', '3', ' '},
                {' ', ' ', ' ', '3', ' '},
                {' ', '3', '3', '3', ' '}
        };

        char[][] digit4 = {
                {' ', '4', ' ', '4', ' '},
                {' ', '4', ' ', '4', ' '},
                {' ', '4', ' ', '4', ' '},
                {' ', '4', '4', '4', ' '},
                {' ', ' ', ' ', '4', ' '},
                {' ', ' ', ' ', '4', ' '},
                {' ', ' ', ' ', '4', ' '},
                {' ', ' ', ' ', '4', ' '}
        };

        char[][] digit5 = {
                {' ', '5', '5', '5', ' '},
                {' ', '5', ' ', ' ', ' '},
                {' ', '5', ' ', ' ', ' '},
                {' ', '5', '5', ' ', ' '},
                {' ', ' ', ' ', '5', ' '},
                {' ', ' ', ' ', '5', ' '},
                {' ', '5', ' ', '5', ' '},
                {' ', '5', '5', '5', ' '}
        };

        char[][] digit6 = {
                {' ', '6', '6', '6', ' '},
                {' ', '6', ' ', ' ', ' '},
                {' ', '6', ' ', ' ', ' '},
                {' ', '6', '6', '6', ' '},
                {' ', '6', ' ', '6', ' '},
                {' ', '6', ' ', '6', ' '},
                {' ', '6', ' ', '6', ' '},
                {' ', '6', '6', '6', ' '}
        };

        char[][] digit7 = {
                {' ', '7', '7', '7', ' '},
                {' ', ' ', ' ', '7', ' '},
                {' ', ' ', ' ', '7', ' '},
                {' ', ' ', '7', ' ', ' '},
                {' ', '7', ' ', ' ', ' '},
                {' ', '7', ' ', ' ', ' '},
                {' ', '7', ' ', ' ', ' '},
                {' ', '7', ' ', ' ', ' '}
        };

        char[][] digit8 = {
                {' ', ' ', '8', ' ', ' '},
                {' ', '8', ' ', '8', ' '},
                {' ', '8', ' ', '8', ' '},
                {' ', ' ', '8', ' ', ' '},
                {' ', '8', ' ', '8', ' '},
                {' ', '8', ' ', '8', ' '},
                {' ', '8', ' ', '8', ' '},
                {' ', ' ', '8', ' ', ' '}
        };

        char[][] digit9 = {
                {' ', '9', '9', '9', ' '},
                {' ', '9', ' ', '9', ' '},
                {' ', '9', ' ', '9', ' '},
                {' ', '9', '9', '9', ' '},
                {' ', ' ', ' ', '9', ' '},
                {' ', ' ', ' ', '9', ' '},
                {' ', ' ', ' ', '9', ' '},
                {' ', '9', '9', '9', ' '}
        };

        charMap = new HashMap<>();

        charMap.put('0', digit0);
        charMap.put('1', digit1);
        charMap.put('2', digit2);
        charMap.put('3', digit3);
        charMap.put('4', digit4);
        charMap.put('5', digit5);
        charMap.put('6', digit6);
        charMap.put('7', digit7);
        charMap.put('8', digit8);
        charMap.put('9', digit9);
    }

    public void printText(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < 8; i++) {
            for (char digit : chars) {
                char[][] charsForDigits = charMap.get(digit);
                for (int j = 0; j < charsForDigits[i].length; j++) {
                    System.out.print(charsForDigits[i][j]);
                }
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
