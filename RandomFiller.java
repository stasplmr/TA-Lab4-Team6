package com.company;

import java.util.Random;

public class RandomFiller implements Filler {

    @Override
    public void fill(int[] array) {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt();
        }
    }

    @Override
    public String toString() {
        return "RandomFiller";
    }
}
