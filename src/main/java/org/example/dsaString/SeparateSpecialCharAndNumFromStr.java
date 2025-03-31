package org.example.dsaString;

public class SeparateSpecialCharAndNumFromStr {


    public static void main(String [] args) {
        String str = "6213brjsnmn2wxvaekj832$%^%%*&&^*&uhxcsd0";
        seprate(str);
    }

    public static void seprate(String str){

        String ansstr= "";

        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if( ch >='a'&& ch<='z' ){
                ansstr=ansstr+str.charAt(i);
            }
        }
        System.out.println("Old String is:  " + str);
        System.out.println("New String is:  " +ansstr);
    }



}
