package org.example.dsaString;

public class RemoveAllSpecialCharacters {


    public static void main(String[] args) {

        String str="!abcd%sd@!";
        method1(str);
        method2(str);

    }

    public static void method1(String str) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if character is alphanumeric
            if ((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z') ||
                    (ch >= '0' && ch <= '9')) {
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());
    }

    public static void method2(String str) {
        String ans= str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(ans);
    }


}
