package org.example.test.dsaString;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseNumber {

    public static void main( String[] args ) {
        int n = 256;
        reverseNum1(n);
    }


//    Brute Force Approach (Basic Arithmetic)
//    This is the one you already wrote. It uses arithmetic to extract and build the reversed number.
    public static void reverseNum1(int n) {
        // reversed number
        int rev = 0;
        // remainder
        int rem;
        while (n > 0) {
            rem = n % 10;  // Extracting last digit
            rev = (rev * 10) + rem;  // Appending to reversed number
            n = n / 10;  // Remove last digit

            // System.out.println(n);
        }
        System.out.println(rev);
    }

//    StringBuilder Reverse Approach
//    Convert the number to a string and reverse it using built-in methods.
    public static void reverseNum2(int n) {
        String str = Integer.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }

//    Recursive Approach
//    Use recursion to reverse the number.
    public static int reverseRecursive(int n, int rev) {
        if (n == 0) return rev;
        return reverseRecursive(n / 10, rev * 10 + n % 10);
    }

    public static void reverseNum3(int n) {
        System.out.println(reverseRecursive(n, 0));
    }

//    Using Stack
//    Push digits to a stack and pop them out to reverse.
    public static void reverseNum4(int n) {
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 10);
            n /= 10;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

//    Using Queue (Not optimal but possible)
//    Just for exploration — similar idea using a queue and reversing it.
    public static void reverseNum5(int n) {
        Queue<Character> queue = new LinkedList<>();
        for (char c : String.valueOf(n).toCharArray()) {
            queue.add(c);
        }
        LinkedList<Character> list = new LinkedList<>(queue);
        Collections.reverse(list);
        for (char c : list) {
            System.out.print(c);
        }
        System.out.println();
    }

//    Using Logarithmic Calculation (Math Approach)
//    More math-heavy and not commonly used, but still valid.
    public static void reverseNum6(int n) {
        int digits = (int)Math.log10(n) + 1;
        int rev = 0;
        for (int i = 0; i < digits; i++) {
            int rem = n % 10;
            rev += rem * Math.pow(10, digits - i - 1);
            n /= 10;
        }
        System.out.println((int)rev);
    }







}
