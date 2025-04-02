package org.example.dsaString;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "kgjafqaytgfedhqgsfhagkz";
        getFirstNonRepeatedChar(str);
        getFirstNonRepeatedChar2(str);
        getFirstNonRepeatedChar3(str);
    }

    // Bruit Force
    public static void getFirstNonRepeatedChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(ch);
                return;
            }
        }
    }

    public static void getFirstNonRepeatedChar2 ( String str){
        Map<Character, Integer > map = new LinkedHashMap<>();
        for ( int i=0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> elem : map.entrySet()){
            if (elem.getValue() == 1){
                System.out.println(elem.getKey());
                break;
            }
        }
        for (Character s: map.keySet()){
            if(map.get(s) == 1){
                System.out.println(s);
                break;
            }
        }
    }


    public static void getFirstNonRepeatedChar3(String str) {
        int[] frequency = new int[256]; // Array to store character counts

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the character at index i
            frequency[currentChar] = frequency[currentChar] + 1;
        }

        // Find the first character that appears only once
        for (char ch : str.toCharArray()) {
            if (frequency[ch] == 1) { // First non-repeating character
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }
    }

    // Note: ASCII value in java
    // In Java, every character (char) has a corresponding ASCII (or Unicode) value, which is essentially its numerical representation.
    // Java uses Unicode, but the first 128 characters of Unicode are the same as ASCII (0-127).
    // Example:
    public class ASCIIExample {
        public static void main(String[] args) {
            char ch = 'A';  // Character
            int asciiValue =  ch;  // Convert to ASCII
            System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);
        }
    }




}