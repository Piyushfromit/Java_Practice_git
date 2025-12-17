package org.example.test.dsaString;

import java.sql.Time;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReplaceCharacterWithOccurrenceCount {

    public static void main(String[] args) {
        String str = "opentextjkt";
        char c = 't';
        replaceCharacterWithOccurrence(str, c);
        replaceCharacterWithOccurrence1(str, c);
    }


//    Brute-force using char[] and String Concatenation
//    Very basic and not memory-efficient (uses immutable String concatenation inside a loop).
//    🔹 Time Complexity: O(n)
//    🔹 Space Complexity: O(n)
    public static void replaceCharacterWithOccurrence1(String str, char c){
        //output like open1ex2jk3
        StringBuilder ans=new StringBuilder();
        int count=1;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch==c){
                ans.append(count);
                count++;
            }else{
                ans.append(ch);
            }
        }
        System.out.println(ans);
    }


//     using a Map to track character counts
//    🔹 Time Complexity: O(n)
//    🔹 Space Complexity: O(n)
    public static void replaceCharacterWithOccurrence(String str, char c){
        //output like open1ex2jk3
        StringBuilder ans=new StringBuilder();
        Map<Character,Integer> map=new LinkedHashMap<>();
        map.put(c,1);
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                ans.append(map.get(ch));
                map.put(ch,map.get(ch)+1);
            }else{
                ans.append(ch);
            }
        }
        System.out.println(ans);
    }

//    Using Java 8 Streams (Fancy but not Ideal for Performance)
//    More for functional programming style.
//    Not recommended for interview or performance-critical use, but good for showing Java 8 knowledge.
    public static void replaceCharacterWithStreams(String str, char c) {
        StringBuilder result = new StringBuilder();
        final int[] count = {1};

        str.chars().forEach(ch -> {
            if (ch == c) {
                result.append(count[0]++);
            } else {
                result.append((char) ch);
            }
        });

        System.out.println(result);
    }

//    Using toCharArray() (Slightly Optimized Access)
//    Similar to using charAt(), but accesses directly from array.
    public static void replaceCharacterWithCharArray(String str, char c) {
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (char ch : chars) {
            if (ch == c) {
                result.append(count++);
            } else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }


}
