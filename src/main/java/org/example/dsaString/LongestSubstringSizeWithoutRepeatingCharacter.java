package org.example.dsaString;

import java.awt.*;
import java.sql.Time;
import java.util.*;

public class LongestSubstringSizeWithoutRepeatingCharacter {

    public static void main(String[] args) {
        String str = "abbcd";
//        longestSubstringWithoutRepCat1(str);
//        longestSubstringWithoutRepCat2(str);
        longestSubstringWithoutRepCat3(str);
    }

//    Brute Force Approach (O(n²))
//    Time Complexity: O(n²)
//    Space Complexity: O(n)
    public static void longestSubstringWithoutRepCat1(String str) {
        int n = str.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (set.contains(str.charAt(j))) {
                    break;
                }
                set.add(str.charAt(j));
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        System.out.println("Brute Force: " + maxLength);
    }

// my fav
    // Sliding Window (Optimized to O(n))
//   Time Complexity: O(n)
//  Space Complexity: O(n)
    public static void   longestSubstringWithoutRepCat2(String str){
        int i=0; int ans=0;

        Set<Character> set=new HashSet<>();

        for(int j=0; j<str.length(); j++){

            char ch=str.charAt(j);

            while(set.contains(ch)){
                set.remove(str.charAt(i));
                i++;
            }
            ans=Math.max(ans,(j-i)+1);
            set.add(ch);
        }

        System.out.println(ans);
    }

    // best
//    Optimized Sliding Window using HashMap (O(n))
//    Instead of removing one character at a time, we can jump the left pointer to the last occurrence +1,
//    reducing unnecessary iterations.
//    ✅ Time Complexity: O(n)
//    ✅ Space Complexity: O(n)
    public static void longestSubstringWithoutRepCat3(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;

        for (int i = 0, j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            if (map.containsKey(ch)) {
                i = Math.max(map.get(ch) + 1, i); // Move left pointer
            }
            map.put(ch, j);
            maxLength = Math.max(maxLength, j - i + 1);
        }

        System.out.println("Optimized Sliding Window: " + maxLength);
    }


//    Optimized using Array (O(n), Best for ASCII strings)
//    Instead of a HashMap, we use a fixed-size array (256 for ASCII) to track character indices.
//    ✅ Time Complexity: O(n)
//    ✅ Space Complexity: O(1) (Fixed array of 256 size)
    public static void longestSubstringWithoutRepCat4(String str) {
        int[] lastIndex = new int[256]; // Stores last index of character
        Arrays.fill(lastIndex, -1);

        int maxLength = 0, i = 0;

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            i = Math.max(lastIndex[ch] + 1, i); // Move left pointer efficiently
            maxLength = Math.max(maxLength, j - i + 1);
            lastIndex[ch] = j; // Update last seen index
        }

        System.out.println("Best Solution (Array Optimization): " + maxLength);
    }






}
