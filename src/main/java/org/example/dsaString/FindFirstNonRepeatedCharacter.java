package org.example.dsaString;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {

    public static void firstNonRepeatedCharacter ( String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0; i< str.length() ; i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }

        for(Character c: map.keySet()){
            if(map.get(c)==1){
                System.out.println(c);
                break;
            }
        }
    }

    public static void main(String[] args) {
        String str = "kgjafqaytgfedhqgsfhagkz";
        firstNonRepeatedCharacter(str);
    }




}