package org.example.dsaString;


public class CharacterInAscendingOrder {

    public static void main (String [] args) {
        String str = "kjhasddaswdkjh";
        charInAscOrder(str);
    }

    public static void charInAscOrder( String str){

        char[] chars = new char[str.length()];

        for (int i =0; i<str.length() ; i++){
            chars[i]= str.charAt(i);
        }

        for (int i=0; i < chars.length -1; i++ ){
            for (int j=i +1; j < chars.length ; j++ ){
                if(chars[i]> chars[j]){
                     char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }

        for (int i =0; i < str.length() ; i++){
            System.out.print(chars[i]);
        }

    }



}
