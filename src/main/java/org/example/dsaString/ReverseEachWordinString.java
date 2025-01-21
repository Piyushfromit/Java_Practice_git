package org.example.dsaString;

public class ReverseEachWordinString {

    public static void main(String[] args) {

        String str="Abhishek chutiya hai";
        String[] arr=str.split(" ");

        
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
