package com.company;

import java.util.ArrayList;

public class DataProcessor {

    private Sorter sorter;
    private Filler filler;

    public DataProcessor(Sorter sorter, Filler filler) {
        this.sorter = sorter;
        this.filler = filler;

    }

    public Sorter getSorter() {
        return sorter;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public Filler getFiller() {
        return filler;
    }

    public void setFiller(Filler filler) {
        this.filler = filler;
    }

    public ArrayList<String> processData(int[] array1, int[] array2, int[] array3) {
        String sorterFiller = sorter.toString() + " " + filler.toString();
        var sortingSpeed = new ArrayList<String>();
        sortingSpeed.add(sorterFiller);
        sortingSpeed.add(timing(array1));
        sortingSpeed.add(timing(array2));
        sortingSpeed.add(timing(array3));
        return sortingSpeed;
    }

    public String timing(int[] array) {
        filler.fill(array);
        int before = (int) System.currentTimeMillis();
        sorter.sort(array);
        int after = (int) System.currentTimeMillis();
        return Integer.toString(after-before);
    }
}
