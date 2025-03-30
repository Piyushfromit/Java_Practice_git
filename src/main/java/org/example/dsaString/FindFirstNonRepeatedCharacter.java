package org.example.dsaString;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {


    public static void getfirstnonrepeatedChar ( String str){

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


    public static void main(String[] args) {
        String str = "kgjafqaytgfedhqgsfhagkz";
        getfirstnonrepeatedChar(str);
    }




}