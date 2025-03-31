package org.example.dsaString;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacterInString {

    public static void main(String[] args) {

        String str = "hello";
        frequency(str);
    }


    public static void frequency(String str){

        Map<Character,Integer> map= new LinkedHashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
             map.put(ch, map.getOrDefault(ch,0)+1);
        }

        System.out.println(map);

    }



}
