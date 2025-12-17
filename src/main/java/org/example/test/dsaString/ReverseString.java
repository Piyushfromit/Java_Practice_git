package org.example.test.dsaString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {
        String str = "gaurav";
        reverseString1(str);
        reverseString2(str);
    }

    // Using StringBuilder (More Efficient)
    // StringBuilder is mutable, so no new objects created.
    public static void reverseString1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }

//    Using StringBuilder.reverse() (Most Concise)
//    Best for readability and performance.
    public static void reverseString2(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }

// Using StringBuffer.reverse() (Thread-safe version)
//    Thread-safe but slower than StringBuilder.
    public static void reverseString4(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse().toString());
    }

//     Using Character Array (In-place reverse)
//     Efficient: No extra objects, no library, in-place logic.
    public static void reverseString5(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(chars));
    }

    // Using Recursion (Elegant but not optimal)
//    Not memory-efficient; uses call stack. Can cause StackOverflowError on large inputs.
    public static String reverseString6(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString6(str.substring(1)) + str.charAt(0);
    }

    public static void callReverseString6(String str) {
        System.out.println(reverseString6(str));
    }

//  Java 8 Streams
    // Cool, but less readable and not as performant.
    public static void reverseString7(String str) {
        String reversed = str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
        System.out.println(reversed);
    }


//    Using Collections and List reversal
//    Not recommended for real use—more code for same result.
    public static void reverseString8(String str) {
        List<Character> chars = new ArrayList<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }
        Collections.reverse(chars);
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }



}
