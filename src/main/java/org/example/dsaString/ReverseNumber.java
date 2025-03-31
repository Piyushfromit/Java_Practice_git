package org.example.dsaString;

public class ReverseNumber {

    public static void main( String[] args ) {
        int n = 256;
        reverse(n);
    }

    public static void reverse(int n) {
        // reversed number
        int rev = 0;
        // remainder
        int rem;
        while (n > 0) {
            rem = n % 10;  // Extracting last digit
            rev = (rev * 10) + rem;  // Appending to reversed number
            n = n / 10;  // Remove last digit

            // System.out.println(n);
        }
        System.out.println(rev);
    }
}
