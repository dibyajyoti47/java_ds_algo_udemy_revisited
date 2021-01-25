package com.dj_learning_dsalgo.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array = new int[] {-21, -13, 5, 17, 23, 55};
//        System.out.println(iterativeBinarySearch (array, -13));
//        System.out.println(iterativeBinarySearch (array, 17));
//        System.out.println(iterativeBinarySearch (array, -134));
//        System.out.println(iterativeBinarySearch (array, 55));
        System.out.println(recursiveBinarySearch (array, -13));
        System.out.println(recursiveBinarySearch (array, 17));
        System.out.println(recursiveBinarySearch (array, -134));
        System.out.println(recursiveBinarySearch (array, 55));

    }

    private static int iterativeBinarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length;
        while (start < end) {
            int midpoint = (start + end) / 2;
            if (array[midpoint] == value) {
                return midpoint;
            } else if (array[midpoint] < value) {
                start = midpoint+1;
            } else if (array[midpoint] > value) {
                end = midpoint;
            }
        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    private static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }
        int midPoint = (start + end) / 2;
//        System.out.println("midpoint = "+ midPoint);
        if (input[midPoint] == value) {
            return midPoint;
        } else if (input[midPoint] < value){
            return recursiveBinarySearch(input, midPoint+1, end, value);
        } else {
            return recursiveBinarySearch(input, start, midPoint, value);
        }
    }
}
