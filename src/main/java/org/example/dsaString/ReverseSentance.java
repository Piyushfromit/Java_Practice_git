package org.example.dsaString;

import java.util.ArrayList;
import java.util.List;

public class ReverseSentance {


    public static void main(String [] args){

        String str ="Hello World My Name is Piyush Kumar";
        List<String> words = new ArrayList<>();
        int start=0;
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)==' '){
                words.add(str.substring(start, i));
                start= i+1;
            }
        }
        words.add(str.substring(start, str.length()));


        String riv="";
        for(int i=words.size()-1; i>=0; i--){
            riv=riv+words.get(i);
            if(i>0){
                riv=riv+" ";
            }
        }
        System.out.println(riv);
    }




}
