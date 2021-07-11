package com.senla.course.tasks.task5;

import java.util.*;

public class VowelFinder {
    private static final String VOWEL_LIST = "аеёиоуыэюяaeiou";

    public static void main(String[] args) {
        System.out.println("Введите слова предложения одной строкой через пробел");
        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();
        System.out.println("В введенном предложении количество гласных букв: " + getCountVowels(enteredText));
        showVowelsInWords(enteredText);
        ArrayList<String> list = getListOfWords(enteredText);
        Collections.sort(list, new VowelCountComparator());
        System.out.println("Слова, отсортированные по количеству гласных: \n" + list);
        System.out.println("Слова с заглавной первой гласной: \n" + capitalizeFirstVowel(enteredText));
    }

    public static int getCountVowels(String str) {
        int count = 0;
        for(int i = 0; i < str.toLowerCase().length (); i++) {
            if(VOWEL_LIST.indexOf(str.charAt(i)) != -1)
                count++;
        }
        return count;
    }

    public static ArrayList<String> getListOfWords(String str) {
        String[] words = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }
        return list;
    }

    public static void showVowelsInWords(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("В " + (i + 1) + " слове " + getCountVowels(words[i]) + " гласных");
        }
    }

    public static String capitalizeFirstVowel(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.toLowerCase().length(); j++) {
                if (VOWEL_LIST.indexOf(word.charAt(j)) != -1) {
                    if (j == 0) {
                        words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
                    } else {
                        words[i] = words[i].substring(0, j) +
                                words[i].substring(j, j + 1).toUpperCase() + words[i].substring(j + 1);
                    }
                    break;
                }
            }
        }
        return String.join(" ", words);
    }

}




