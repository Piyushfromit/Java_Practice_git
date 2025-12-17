package org.example.test.dsaString;

import java.sql.Time;
import java.util.regex.Pattern;

public class RemoveSpecialCharacters {


    public static void main(String[] args) {

        String str="!ab5cd%sd@!";
        removeSpecialChar1(str);
        removeSpecialChar2(str);

    }

//    Brute Force Approach (Using Loop & Character Checks)
//    Explicitly checks each character using if conditions.
//    Works but is not scalable for large inputs.
    public static void removeSpecialChar1(String str) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if character is alphanumeric
            if ((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z') ||
                    (ch >= '0' && ch <= '9')) {
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());
    }

//    Using Regular Expressions (replaceAll)
//    Uses regex to remove all non-alphanumeric characters in a single step.
//    More concise and efficient for large inputs.
//Time Complexity: 𝑂(𝑛)(since regex processing still needs to scan each character)
//    Space Complexity: 𝑂(𝑛)
    public static void removeSpecialChar2(String str) {
        String ans= str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(ans);
    }


//    Using Java Streams (Functional Approach)
//    Uses Java 8 Streams to filter alphanumeric characters.
//    Time Complexity:O(n)
//    Space Complexity:O(n)
    public static void removeSpecialChar3(String str) {
        String result = str.chars()
                .filter(ch -> java.lang.Character.isLetterOrDigit(ch))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println(result);
    }


//    Using replaceAll() with Precompiled Pattern (Best for Repeated Calls)
//    Precompiling regex avoids redundant pattern compilation, improving efficiency in case of multiple method calls.
//    Time Complexity:O(n) (better for repeated calls due to precompiled regex)
//    Space Complexity:O(n)

    public class removeSpecialChar4 {
        private static final Pattern PATTERN = Pattern.compile("[^a-zA-Z0-9]");

        public static void removeSpecialChar4(String str) {
            String result = PATTERN.matcher(str).replaceAll("");
            System.out.println(result);
        }
    }

//    Using StringBuilder with Character.isLetterOrDigit() (Best for Performance)
//    Uses built-in Character.isLetterOrDigit() for better clarity.
//    StringBuilder ensures optimal memory usage.
//    Time Complexity:O(n)
//    Space Complexity:O(n)

    public static void removeSpecialChar5(String str) {
        StringBuilder ans = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (java.lang.Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }
        }
        System.out.println(ans.toString());
    }








}
