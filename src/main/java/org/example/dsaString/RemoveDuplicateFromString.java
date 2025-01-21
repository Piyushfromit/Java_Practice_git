package org.example.dsaString;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {
    	

        String str="abhishek";

        //Approch 1

        StringBuilder sb=new StringBuilder();

        str.chars().distinct().forEach(s->sb.append((char)s));
        System.out.println(sb);

        //Approch 2

        Set<Character> set=new LinkedHashSet<>();

        for(int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
        }
        StringBuilder ans= new StringBuilder();

        for(Character c:set){
            ans.append(c);
        }
        System.out.println(ans);



    }
}
