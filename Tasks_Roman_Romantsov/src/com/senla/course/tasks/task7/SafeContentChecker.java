package com.senla.course.tasks.task7;

import java.util.Arrays;
import java.util.List;

/** Provides methods for filling Safe by most valuable items */

public class SafeContentChecker {
    public void fillSafe(Safe safe, List<Item> items) {
        int maxCapacity = safe.getMaximumCapacity();
        int[][] table = new int[items.size() + 1][maxCapacity + 1];
        for (int[] array : table) {
            Arrays.fill(array, 0);
        }
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            for (int capacity = 1; capacity < maxCapacity + 1; capacity++) {
                int previousItemsValue = table[i][capacity];
                if (capacity >= item.getVolume()) {
                    int valueFreeingVolumeForItem = table[i][capacity - item.getVolume()];
                    table[i + 1][capacity] = Math.max(valueFreeingVolumeForItem + item.getValue(), previousItemsValue);
                } else {
                    table[i + 1][capacity] = previousItemsValue;
                }
            }
        }
        for (int i = items.size(); i > 0; i--) {
            if (table[i - 1][maxCapacity] != table[i][maxCapacity]) {
                safe.putItem(items.get(i - 1));
                maxCapacity -= items.get(i - 1).getVolume();
            }
        }
    }
}
