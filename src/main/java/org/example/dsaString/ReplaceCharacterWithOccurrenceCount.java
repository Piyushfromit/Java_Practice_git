package org.example.dsaString;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReplaceCharacterWithOccurrenceCount {

    public static void main(String[] args) {
        String str = "opentextjkt";
        char c = 't';
        replaceCharacterWithOccurrence(str, c);
        replaceCharacterWithOccurrence2(str, c);
    }

    public static void replaceCharacterWithOccurrence2(String str, char c){
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



}
