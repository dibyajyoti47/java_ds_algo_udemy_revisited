package com.dj_learning_dsalgo.searching;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{9, 10, 34, -54, 67, 21}, -554));
    }
    private static int search (int[] inputArray, int inputNum) {
        for (int i=0; i<inputArray.length; i++) {
            if (inputNum == inputArray[i]) {
                return i;
            }
        }
        return -1;
    }
}
