package com.senla.course.tasks.task5;

import java.util.Comparator;
import static com.senla.course.tasks.task5.VowelFinder.getCountVowels;

public class VowelCountComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return getCountVowels(str2) - getCountVowels(str1);
    }
}
