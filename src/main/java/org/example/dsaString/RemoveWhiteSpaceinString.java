package org.example.dsaString;

public class RemoveWhiteSpaceinString {

    public static void main(String[] args) {

        String str=" Abhishek Chutiya hai ";
        String ans=str.replaceAll("\\s","");
        System.out.println(ans);
    }
}
