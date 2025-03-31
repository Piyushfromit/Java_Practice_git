package org.example.dsaString;

public class RemoveWhiteSpaceFromString {

    public static void main(String[] args) {

        String str = " Abhishek Chutiya hai ";
        removeWhiteSpace(str);
        removeWhiteSpace2(str);
    }

    public static void removeWhiteSpace(String str){

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< str.length() ; i++){
            if ( str.charAt(i)==' '){
                continue;
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }


    public static void removeWhiteSpace2(String str){
        String ans=str.replaceAll("\\s","");
        System.out.println(ans);
    }
}
