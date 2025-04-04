package org.example.dsaString;

import java.sql.Time;
import java.util.regex.Pattern;

public class RemoveWhiteSpaceFromString {

    public static void main(String[] args) {

        String str = " Abhishek Chutiya hai ";
        removeWhiteSpace1(str);
        removeWhiteSpace2(str);
    }

//    Brute Force Approach (Using Loop & Conditions)
//    Iterates through each character, skipping spaces manually.
//    Simple but not the most optimized.
//    Time Complexity:O(n)
//    Space Complexity:O(n)
    public static void removeWhiteSpace1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

//    Using replaceAll() (Regex-Based)
//    Uses regular expressions to remove all spaces in one go.
//    Time Complexity:O(n)
//    Space Complexity:O(n)
    public static void removeWhiteSpace2(String str) {
        String result = str.replaceAll("\\s+", ""); // \s matches any whitespace
        System.out.println(result);
    }

//    Using Java Streams (Functional Approach)
//    Uses Java 8 streams for a modern and concise way to filter out spaces.
//    Time Complexity:O(n)
//    Space Complexity:O(n)
    public static void removeWhiteSpace3(String str) {
        String result = str.chars()
                .filter(ch -> ch != ' ')
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println(result);
    }


//    Using Precompiled Pattern for Efficiency (Best for Multiple Calls)
//    Precompiles the regex pattern to improve performance for repeated calls.
//    Time Complexity:O(n)
//    Space Complexity:O(n)
    public class removeWhiteSpace4 {
        private static final Pattern SPACE_PATTERN = Pattern.compile("\\s+");

        public static void removeWhiteSpace4(String str) {
            String result = SPACE_PATTERN.matcher(str).replaceAll("");
            System.out.println(result);
        }
    }


//    Using Character.isWhitespace() with StringBuilder (Best for Performance)
//    Uses Character.isWhitespace() to handle all types of spaces efficiently.
//    Time Complexity:O(n)
//    Space Complexity:O(n)
    public static void removeWhiteSpace5(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!java.lang.Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }


}
