package org.example.dsaString;

import java.sql.Time;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfSentence {


    public static void main(String[] args) {
        String str = "i am Piyush";
        reverseEachWord1(str);
    }

//    Using StringBuilder — Efficient & Clean
//    Fixes inefficiencies by using StringBuilder.
//    ✅ Time: O(n)
//    ✅ Space: O(n)
    public static void reverseEachWord1(String str){
        String[] arr = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            String word=arr[i];
            StringBuilder rev = new StringBuilder();
            for(int j=word.length()-1; j>=0; j--){
                rev.append(word.charAt(j));
            }
            ans.append(rev).append(" ");
        }
        System.out.println(ans);
    }

//    In-Place Reversal using char[]
//    Advanced: reverse characters of each word in-place using char array.
//    ✅ Time: O(n)
//✅ Space: O(n) for output string (but no extra structures like split/array)
//    This is most optimal in-place, especially useful in competitive coding or when memory is limited.

    public static void reverseEachWordInPlace(String str) {
        char[] chars = str.toCharArray();
        int start = 0;

        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' ') {
                reverse(chars, start, i - 1);
                start = i + 1;
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


//    Using Java 8 Streams (Fancy Style)
//    Just for showing off functional skills — not ideal for large strings.
    public static void reverseEachWordStream(String str) {
        String result = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }



}
