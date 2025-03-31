package org.example.dsaString;

public class ReverseEachWordOfSentence {


    public static void main(String[] args) {
        String str = "i am Piyush";
        reverseEachWord(str);
    }

    public static void reverseEachWord(String str){
        String[] arr = str.split(" ");
        String ans="";
        for(int i=0; i<arr.length; i++){
            String word=arr[i];
            String rev="";
            for(int j=word.length()-1; j>=0; j--){
                rev+= word.charAt(j);
            }
            ans+=rev+" ";
        }
        System.out.println(ans);
    }


}
