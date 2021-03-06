package com.dj_learning_dsalgo.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        for (int i=1; i<intArray.length; i++) {
            int newElement = intArray[i];
            int j;
            for(j=i; j>0 && intArray[j-1] > newElement; j--) {
                intArray[j] = intArray[j-1];
            }
            intArray[j]= newElement;
        }


        Arrays.stream(intArray).forEach(System.out::println);
    }
}
