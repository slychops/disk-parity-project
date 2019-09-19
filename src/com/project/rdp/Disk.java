package com.project.rdp;

import java.util.HashMap;
import java.util.Map;

public class Disk {
    public static final int NUMBEROFFIELDS = 4;

    Map<Integer, Integer> rowValues;

    public Disk() {
        rowValues = new HashMap<Integer, Integer>();
    }



    public void writeDataToDisk() {
        for (int i = 0; i < NUMBEROFFIELDS; i++) {
            rowValues.put(i, getRandomValue());
        }
    }

    private int getRandomValue() {
        return ((int) (Math.random() * 20));
    }


    public Map<Integer, Integer> getRowValues() {
        return rowValues;
    }
}
