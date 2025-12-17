package org.example.test.dsaString;

import java.sql.Time;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {

        String str = "abhishek";
//        removeDuplicateCharBruteForce(str);
//        removeDuplicateCharBruteForceb(str);
        removeDuplicateCharBooleanArray(str);

    }






//    Brute-Force Approach (O(N²))
//    Logic: Iterate through the string, check if a character is already included in the result, and add it only if it's unique.
//
//    Time Complexity: O(N²) (due to contains() check inside a loop).
    public static void removeDuplicateCharBruteForce(String str) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ans.indexOf(String.valueOf(ch)) == -1) {  // Checking if ch already exists
                ans.append(ch);
            }
        }

        System.out.println(ans);
    }
    public static void removeDuplicateCharBruteForceb(String str) {

        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(s -> sb.append((char) s));
        System.out.println(sb);

    }
//    Using HashSet (Unordered, O(N))
//    Logic: Use HashSet to store unique characters.
//    Time Complexity: O(N) (as add() is O(1) on average).
//    Drawback: Order is not maintained.
    public static void removeDuplicateCharHashSet(String str) {
        Set<Character> set = new HashSet<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (set.add(ch)) {  // If added successfully, append it
                ans.append(ch);
            }
        }

        System.out.println(ans);
    }

// My fav
//    Using LinkedHashSet (Ordered, O(N))
//    Logic: Similar to HashSet but preserves insertion order.
//
//    Time Complexity: O(N).
    public static void removeDuplicateCharLinkedHashSet(String str) {
        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder ans = new StringBuilder();
        for (char c : set) {
            ans.append(c);
        }

        System.out.println(ans);
    }

//    Using Boolean Array (Fastest for ASCII, O(N))
//    Logic: Since ASCII has 256 characters, we use a boolean array to track visited characters.
//
//    Time Complexity: O(N) (Fastest, no additional data structure except array).
//
//    Drawback: Only works for fixed character sets (ASCII or extended ASCII).

    public static void removeDuplicateCharBooleanArray(String str) {
        boolean[] seen = new boolean[256];  // Supports ASCII characters
        StringBuilder ans = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                ans.append(ch);
            }
        }

        System.out.println(ans);
    }

//    Using Streams (Modern & Concise, O(N))
//    Logic: Uses Java Streams to filter out duplicates while maintaining order.
//    Time Complexity: O(N) (depends on internal processing).
//    Concise but may be slower than other O(N) approaches due to stream overhead.

    public static void removeDuplicateCharStreams(String str) {
        String result = str.chars()
                .distinct()  // Removes duplicates while maintaining order
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(result);
    }

}
