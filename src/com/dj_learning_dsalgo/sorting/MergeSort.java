package com.dj_learning_dsalgo.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        mergeSort(intArray, 0, intArray.length);
        Arrays.stream(intArray).forEach(System.out::println);
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        int[] tempArray = new int[end-start];
        int tempArrayIndex = 0;

        int i = start;
        int j = mid;

        while (i < mid && j< end) {
            if (input[i] <= input[j]){
                tempArray[tempArrayIndex++] = input[i++];
            } else {
                tempArray[tempArrayIndex++] = input[j++];
            }
        }
        //below line is for copying the last left out element in the left array (in case),
        //    which has to go the  the just after end of thr right array.
        //    note tempparray doesn't contain this element because soon after j value reaches to the last of right array
        //    while loop ends, so we still have one element left in the left array.
        System.arraycopy(input, i, input, start+tempArrayIndex, mid-i); //tricky part
        System.arraycopy(tempArray, 0, input, start, tempArrayIndex);
    }
}
