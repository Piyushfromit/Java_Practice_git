package org.example.test.dsaString;

import java.lang.ref.Cleaner;
import java.util.*;
import java.util.stream.Collectors;

public class ReverseSentence {


    public static void main(String [] args) {
        String str = "Hello World My Name is Piyush Kumar";
        reverseSentence1(str);
    }


//  Brute force
//  manually splitting the string into words and reversing it. This is totally fine but can be simplified or optimized.
    public static void reverseSentence1(String str){
        List<String> words = new ArrayList<>();
        int start=0;
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)==' '){
                words.add(str.substring(start, i));
                start= i+1;
            }
        }
        words.add(str.substring(start, str.length()));
        String riv="";
        for(int i=words.size()-1; i>=0; i--){
            riv=riv+words.get(i);
            if(i>0){
                riv=riv+" ";
            }
        }
        System.out.println(riv);
    }

// Using split() and StringBuilder (Cleanest and Recommended)
// ✅ Handles multiple spaces
// ✅ Cleaner and faster due to built-in split
// ✅ Uses StringBuilder for better performance
    public static void reverseSentence2(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) reversed.append(" ");
        }
        System.out.println(reversed.toString());
    }

// Using Collections and List Utilities
// ✅ Short and expressive
// ✅ Uses Collections.reverse
// ✅ Uses String.join to reconstruct string
    public static void reverseSentence3(String str) {
        List<String> words = Arrays.asList(str.trim().split("\\s+"));
        java.util.Collections.reverse(words);
        System.out.println(java.lang.String.join(" ", words));
    }

//   Using Stack
    // Intuitive for beginners
    // Extra space for stack
    public static void reverseSentence4(String str) {
        Stack<String> stack = new Stack<>();
        for (String word : str.trim().split("\\s+")) {
            stack.push(word);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (!stack.isEmpty()) reversed.append(" ");
        }
        System.out.println(reversed.toString());
    }


    // Recursive Approach
    //  Good for understanding recursion
    //  ⚠️ Not optimal for very large strings (stack overflow risk)
    public static void reverseSentence5(String str) {
        String[] words = str.trim().split("\\s+");
        System.out.println(reverseRecursive(words, words.length - 1));
    }

    public static String reverseRecursive(String[] words, int index) {
        if (index == 0) return words[0];
        return words[index] + " " + reverseRecursive(words, index - 1);
    }


    // In-Place Word Reversal (Character Array)
//    Reverse the entire string, then reverse each word individually. Bit more complex but good in interviews.
    // Most memory-efficient (no extra space except char array)
    // A bit tricky, great for interviews
    public static void reverseSentence6(String str) {
        char[] chars = str.toCharArray();
        reverse(chars, 0, chars.length - 1);

        int start = 0;
        for (int end = 0; end <= chars.length; end++) {
            if (end == chars.length || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }

        System.out.println(new String(chars));
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }


//    Using Streams (Java 8+)
//    If you want to be fancy and concise:
//  Concise but not always best for performance
// Great for modern Java lovers
    public static void reverseSentence7(String str) {
        String reversed = Arrays.stream(str.trim().split("\\s+"))
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return String.join(" ", list);
                }));
        System.out.println(reversed);
    }



}
