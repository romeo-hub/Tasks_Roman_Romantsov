package com.senla.course.tasks.task7;

/** Describes item which we can put in a Safe */

public class Item {
    private int volume;
    private int value;

    public Item(int volume, int value) {
        this.volume = volume;
        this.value = value;
    }

    public int getVolume() {
        return volume;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "volume=" + volume +
                ", value=" + value +
                '}';
    }
}
