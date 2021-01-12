package com.dj_practicing_dsalgo.stack;

import java.util.Arrays;

public class Challege1 {
    public static void main(String[] args) {
        String s1 = "Racecar";
        String s2 = "I did, did i ?";
        String s3 = "Hello";
        System.out.print(isPalindrome("abcbb"));
    }
    
    public static boolean isPalindrome (String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int halflength = (s.length()/2) + (s.length()%2);
        ArrayStack<Character> stack = new ArrayStack<Character>(halflength);
        for (int i=0; i< halflength ; i++) {
            stack.push(s.charAt(i));
        }
        boolean flag = true;
        for (int i=s.length()/2; i<s.length();i++){
            if (s.charAt(i) != stack.pop()) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
