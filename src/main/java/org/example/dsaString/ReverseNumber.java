package org.example.dsaString;

public class ReverseNumber {



    public static void main( String[] args ){

        int n = 654;

        int riv=0;

        while(n>0){
            int rem= n%10;
            riv = riv*10 + rem;
            n=n/10;


        }

        System.out.println("reversed number is:  " + riv);


    }
}
