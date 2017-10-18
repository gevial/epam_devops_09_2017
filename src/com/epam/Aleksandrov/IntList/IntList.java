package com.epam.Aleksandrov.IntList;

import java.util.Arrays;

public class IntList {

    private int[] arr;
    private int cursor;

    public IntList() {
        arr = new int[16];
    }

    public IntList(int size) {
        arr = new int[size];
    }

    public void add(int value) {
        if (cursor < arr.length) {
            arr[cursor] = value;
            cursor++;
        } else {
            int orig_length = arr.length;
            int[] new_arr = new int[arr.length * 2];
            System.arraycopy(arr, 0, new_arr, 0, arr.length);
            arr = new_arr;
            arr[cursor] = value;
            cursor++;
        }
    }

    public void add(int value, int index) {
        if (cursor < arr.length) {

        }
        arr[index] = value;
    }

    public void set(int value, int index) {
        arr[index] = value;
    }

    public void remove() {
        // TODO validate index in bounds
    }

    public void removeAll() {
        // TODO validate index in bounds
    }

    public void removeFrom(int value, int index) {
        // TODO validate index in bounds
        arr[index] = value;
    }

    public void getArr() {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int v = 3;
        IntList a = new IntList(v);
        a.getArr();
        a.add(5);
        a.getArr();
    }
}
