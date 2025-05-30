package org.example.dsaString;



public class CheckPrime {

    public static void main(String[] args) {
        int num = 14;
        checkPrime(num);
        checkPrime2(num);
    }

    public static void checkPrime(int num){
        if (num < 2) {
            System.out.println(num + " is Not a prime number");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {  // Only checking up to num/2
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(num +" is a prime number ");
        }else {
            System.out.println(num +" is Not a prime number ");
        }
    }


    public static void checkPrime2(int num) {
        if (num < 2) {
            System.out.println(num + " is Not a prime number");
            return;
        }
        boolean isPrime = true;
        for (int i = 2;  i*i <= num; i++) {  // Checking only up to sqrt(num)
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(num +" is a prime number ");
        }else {
            System.out.println(num +" is Not a prime number ");
        }
    }



}
