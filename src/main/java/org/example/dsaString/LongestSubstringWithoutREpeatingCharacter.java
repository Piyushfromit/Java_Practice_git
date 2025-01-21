package org.example.dsaString;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutREpeatingCharacter {

    public static void main(String[] args) {

        String str="abbcb";
        int l=0;
        int ans=0;

        Set<Character> set=new HashSet<>();

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            while(set.contains(ch)){
                set.remove(str.charAt(l));
                l++;
            }
            ans=Math.max(ans,(i-l)+1);
            set.add(ch);
        }
        System.out.println(ans);


    }
}
