package com.dj_learning_dsalgo.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex >= 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for (int j=1; j<=lastUnsortedIndex; j++) {
                if (intArray[j] > intArray[largestIndex]){
                    largestIndex = j;
                }
            }
            int temp = intArray [lastUnsortedIndex];
            intArray [lastUnsortedIndex] = intArray[largestIndex];
            intArray[largestIndex] = temp;
        }
        for (int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
