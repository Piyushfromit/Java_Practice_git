package org.example.dsaString;

public class ReverseString {

    public static void main(String[] args) {
        String str = "gaurav";
        reverse(str);
        reverse2(str);
    }

    public static void reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }

    public static void reverse2(String str) {
        StringBuilder srev= new StringBuilder(str);
        srev.reverse();
        System.out.println(srev);
    }


}
