package com.company;

public class InsertionSort implements Sorter {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (key > array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = key;
        }
    }

    @Override
    public String toString() {
        return "InsertionSort";
    }
}
