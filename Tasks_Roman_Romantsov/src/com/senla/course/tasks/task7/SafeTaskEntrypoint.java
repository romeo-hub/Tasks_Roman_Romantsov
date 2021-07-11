package com.senla.course.tasks.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Entrypoint for seventh task */

public class SafeTaskEntrypoint {
    private static final String PROVIDED_SAFE               = "We have a safe with capacity: ";
    private static final String PROVIDED_ITEM_LIST          = "We have a list with items: ";
    private static final String RESULT                      = "Best way to put these items in a safe: ";
    private static final String RESULT_SAFE_STATISTIC       = "Total volume: ";
    private static final String RESULT_VALUE_STATISTIC      = "Total value: ";

    private static Safe safe = new Safe(20);
    private static List<Item> items = new ArrayList<>();

    public static void main(String[] args) {
        {
            Collections.addAll(
                    items,
                    new Item(50, 500),
                    new Item(2,  300),
                    new Item(35, 400),
                    new Item(3, 1000),
                    new Item(3, 1000),
                    new Item(15,  50),
                    new Item(20, 800),
                    new Item(1,  100),
                    new Item(100, 300),
                    new Item(18, 300),
                    new Item(200, 700),
                    new Item(10, 1100)
            );
        }
        SafeContentChecker checker = new SafeContentChecker();
        System.out.println(PROVIDED_SAFE + safe.getMaximumCapacity());
        System.out.println(PROVIDED_ITEM_LIST + items);
        checker.fillSafe(safe, items);
        System.out.println(RESULT + safe.getItemList());
        System.out.println(RESULT_SAFE_STATISTIC + safe.getTotalVolume());
        System.out.println(RESULT_VALUE_STATISTIC + safe.getTotalValue());
    }
}
