package org.example.dsaString;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "kgjafqaytgfedhqgsfhagkz";
        getFirstNonRepeatedChar(str);
        getFirstNonRepeatedChar2(str);
        getFirstUniqueChar3(str);
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



    public static void getFirstUniqueChar3(String str) {
        int[] frequency = new int[256]; // Array to store character counts

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the character at index i
            frequency[currentChar]++; // Increase its count in the array
        }

        // Find the first character that appears only once
        for (char ch : str.toCharArray()) {
            if (frequency[ch] == 1) { // First non-repeating character
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }
    }







}