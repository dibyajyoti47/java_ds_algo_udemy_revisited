package com.dj_practicing_dsalgo.queue;

import com.dj_practicing_dsalgo.stack.ArrayStack;

public class Challenge1 {
    public static void main(String[] args) {
        String s1 = "Racecar";
        String s2 = "I did, did i ?";
        String s3 = "Hello";
        System.out.print(isPalindrome("Racecarf"));
    }

    public static boolean isPalindrome (String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        Queue<Character> queue = new Queue<Character>(s.length());
        for (int i=s.length()-1; i>=0;i--) {
            queue.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder(s.length());
        while(queue.getSize() > 0) {
            sb.append(queue.poll());
        }
        return sb.toString().equals(s);
    }
}
