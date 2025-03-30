package org.example.dsaString;



public class CheckPrime {

    public static void main(String[] args) {
        int num = 14;
        checkPrime(num);
    }

    public static void checkPrime(int num){

        int count = 0;

        for ( int i=2; i<= num/2; i++) {
            if(num % i ==0) {
                count ++;
            }
        }

        if(count == 0) {
            System.out.println(num +" is a prime number ");
        }else {
            System.out.println(num +" is Not a prime number ");
        }

    }



}
