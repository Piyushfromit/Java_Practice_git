package org.example.test.dsaString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacterInString {

    public static void main(String[] args) {
        String str = "hello";
        countFrequency(str);
        countFrequency2(str);
        countFrequency3(str);
        countFrequency4(str);
    }


//    Brute Force Approach (Nested Loops)
//    Time Complexity: O(N²)
//    Space Complexity: O(1) (No extra space except variables)
    public static void countFrequency(String str) {
        boolean[] visited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) continue;
            char ch = str.charAt(i);
            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(ch + " : " + count);
        }
    }

//    Using a HashMap (Efficient Approach)
//    Time Complexity: O(N)
//    Space Complexity: O(N)
    public static void countFrequency2(String str){

        Map<Character,Integer> map= new LinkedHashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
             map.put(ch, map.getOrDefault(ch,0)+1);
        }

//        for (char ch : str.toCharArray()) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }

        System.out.println(map);

    }


//    Using an Array (Optimized for lowercase alphabets)
//    Time Complexity: O(N)
//    Space Complexity: O(1) (Fixed-size array, efficient)
    public static void countFrequency3(String str) {
        int[] freq = new int[26]; // For lowercase letters 'a' to 'z'

        for (char ch : str.toCharArray()) {
            //freq[ch] = freq[ch] + 1;
            freq[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " : " + freq[i]);
            }
        }
    }



//    Using Java 8 Streams
//    Time Complexity: O(N)
//    Space Complexity: O(N)
    public static void countFrequency4(String str) {
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        frequencyMap.forEach((key, value) -> System.out.println(key + " : " + value));

    }


//    Using Java 8 Streams (Parallel Processing)
//    Time Complexity: O(N) (Best Case, Parallel Execution)
//    Space Complexity: O(N)

    public static void countFrequency5(String str) {
        Map<Character, Long> frequencyMap = str.chars()
                .parallel()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingByConcurrent(c -> c, Collectors.counting()));

        frequencyMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }




}
