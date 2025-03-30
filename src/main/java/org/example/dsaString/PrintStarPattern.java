package org.example.dsaString;


public class PrintStarPattern {


//             *
//             * *
//             * * *
//             * * * *
//             * * * * *
//             * * * *
//             * * *
//             * *
//             *

    public static void printStar( int num){

        for(int i=0; i< num; i++){
            String s = "";
            for(int j=0; j <= i; j++){
                 s= s+ " *";
            }
            System.out.println(s);
        }

        for(int i=num-2; i >= 0; i--){
            String t = "";
            for(int j=0; j <=i; j++){
                t= t+ " *";
            }
            System.out.println(t);
        }


    }


    public static void main (String [] args) {
        int n = 5;
        printStar( n);
    }







}
