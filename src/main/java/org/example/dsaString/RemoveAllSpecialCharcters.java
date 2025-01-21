package org.example.dsaString;

public class RemoveAllSpecialCharcters {

    public static void main(String[] args) {

        String str="!abcd%sd@!";

      String ans= str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(ans);


    }
}
