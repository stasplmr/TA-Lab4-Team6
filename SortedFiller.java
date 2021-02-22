package com.company;

public class SortedFiller implements Filler {

    @Override
    public void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
    }

    @Override
    public String toString() {
        return "SortedFiller";
    }
}
