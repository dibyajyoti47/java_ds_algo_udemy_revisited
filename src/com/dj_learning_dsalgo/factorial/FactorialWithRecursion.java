package com.dj_learning_dsalgo.factorial;

public class FactorialWithRecursion {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(4));
    }

    public static int recursiveFactorial (int num) {
        if (num == 0) return 1;
        return num * recursiveFactorial(num-1);
    }
}
