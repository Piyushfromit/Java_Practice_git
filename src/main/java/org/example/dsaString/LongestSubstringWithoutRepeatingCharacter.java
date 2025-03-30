package org.example.dsaString;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {

    public static void main(String[] args) {

        String str = "abbcb";
        longestSubstringWithoutRepCat(str);

    }

    public static void   longestSubstringWithoutRepCat(String str){
        int i=0; int ans=0;

        Set<Character> set=new HashSet<>();

        for(int j=0; j<str.length(); j++){

            char ch=str.charAt(j);

            while(set.contains(ch)){
                set.remove(str.charAt(i));
                i++;
            }
            ans=Math.max(ans,(j-i)+1);
            set.add(ch);
        }

        System.out.println(ans);

    }
}
