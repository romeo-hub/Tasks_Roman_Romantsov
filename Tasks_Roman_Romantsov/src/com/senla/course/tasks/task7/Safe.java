package com.senla.course.tasks.task7;

import java.util.ArrayList;
import java.util.List;

/** Describes Safe where we can store Items */

public class Safe {
    private static final String     EXCEPTION_MESSAGE = "Too heavy!";
    private              int        maximumCapacity;
    private              int        summaryCapacity   = 0;
    private              List<Item> items             = new ArrayList<>();

    public Safe(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void putItem(Item item) {
        int futureCapacity = summaryCapacity + item.getVolume();
        if (futureCapacity < maximumCapacity) {
            summaryCapacity += item.getVolume();
            items.add(item);
        } else {
            System.out.println(EXCEPTION_MESSAGE);
        }
    }

    public int getTotalValue() {
        int totalValue = 0;
        for (Item item : items) {
            totalValue += item.getValue();
        }
        return totalValue;
    }

    public int getTotalVolume() {
        int totalVolume = 0;
        for (Item item : items) {
            totalVolume += item.getVolume();
        }
        return totalVolume;
    }

    public List<Item> getItemList() {
        return items;
    }
}
