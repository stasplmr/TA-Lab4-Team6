package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array1k = new int[1_000];
        int[] array10k = new int[10_000];
        int[] array100k = new int[100_000];

        DataProcessor dp1 = new DataProcessor(new BubbleSort(), new RandomFiller());
        System.out.println(dp1.processData(array1k, array10k, array100k));

        DataProcessor dp2 = new DataProcessor(new InsertionSort(), new RandomFiller());
        System.out.println(dp2.processData(array1k, array10k, array100k));

        DataProcessor dp3 = new DataProcessor(new SelectionSort(), new RandomFiller());
        System.out.println(dp3.processData(array1k, array10k, array100k));

        DataProcessor dp4 = new DataProcessor(new BubbleSort(), new SortedFiller());
        System.out.println(dp4.processData(array1k, array10k, array100k));

        DataProcessor dp5 = new DataProcessor(new InsertionSort(), new SortedFiller());
        System.out.println(dp5.processData(array1k, array10k, array100k));

        DataProcessor dp6 = new DataProcessor(new SelectionSort(), new SortedFiller());
        System.out.println(dp6.processData(array1k, array10k, array100k));
    }
}
