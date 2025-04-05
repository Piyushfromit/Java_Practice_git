package org.example.dsaString;

import java.sql.Time;
import java.util.stream.IntStream;

public class CheckPalindrome {

    public static void main(String [] j){

        String str = "abcba";
        isPalindrome1(str);

    }


//    Brute Force: Reverse and Compare
//    Time Complexity:
//    O(n²) — because string concatenation (+) in Java creates new strings each time.
//    Space Complexity:
//    O(n) — to store the reversed string.
    public static void isPalindrome1(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i); // Inefficient string concatenation
        }
        System.out.println(s.equals(reversed));
    }



//    Using StringBuilder (Improved Brute Force)
//    Idea: Use StringBuilder to reverse efficiently.
//    Time Complexity:
//    O(n)
//    Space Complexity:
//    O(n)
    public static void isPalindrome2(String s) {
        StringBuilder  reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        System.out.println(s.equals(reversed.toString()));

    }
    public boolean isPalindrome2b(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        return s.equals(reversed);
    }


//    Two-Pointer Approach (Optimal)
//    Idea: Use two pointers — one at the start, one at the end — and compare characters moving inward.
//    Time Complexity:
//    O(n)
//    Space Complexity:
//    O(1) — no extra space used.
    public boolean isPalindrome3(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

//    Recursive Approach
//    Idea: Check first and last characters, then recurse on substring.
//    Time Complexity:
//    O(n)
//    Space Complexity:
//    O(n) (due to recursive stack calls)
    public boolean isPalindrome4(String s) {
        return check(s, 0, s.length() - 1);
    }

    private boolean check(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return check(s, left + 1, right - 1);
    }

//    Using Java 8 Streams (Functional Style)
//    This is more of a fun/functional way, not recommended for performance-critical code.
//    Time Complexity:
//    O(n)
//    Space Complexity:
//    O(1)
    public boolean isPalindrome5(String s) {
        return IntStream.range(0, s.length() / 2)
                .allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));
    }


//    Ignore Case and Non-Alphanumerics (Interview Variant)
//    For interview-style questions where you have to ignore case and remove non-alphanumeric characters:
//    Time Complexity:
//    O(n) for cleanup + O(n) for check = O(n)
//    Space Complexity:
//    O(n) for cleaned-up string
    public boolean isPalindrome6(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }


}
