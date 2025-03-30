package org.example.dsaString;

public class SeperateSpecialCharAndNumFromStr {


    public static void main(String [] args){
        String str= "6213brjsnmn2wxvaekj832$%^%%*&&^*&uhxcsd0";

        String ansstr= "";

        for(int i=0; i< str.length(); i++){

            if( str.charAt(i)>='a'&&str.charAt(i)<='z' ){

                ansstr=ansstr+str.charAt(i);

            }

        }
        System.out.println("Old String is:  " + str);
        System.out.println("New String is:  " +ansstr);
    }

}
