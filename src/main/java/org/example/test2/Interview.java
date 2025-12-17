package org.example.test2;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Interview {
    public static void main(String[] args) {
        int arr[] = {7, 9, 4, 8, 5, 9, 4};
        int tar = 17;
        int indexOne = -1;
        int indexTwo = -1;
        boolean found = false;

        for (int i = 0; i < arr.length && !found; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == tar) {
                    indexOne = i;
                    indexTwo = j;
                    found = true; // mark that we found the pair
                    break;        // break inner loop
                }
            }
        }

        if (found) {
            System.out.println("The first index: " + indexOne);
            System.out.println("The second index: " + indexTwo);
        } else {
            System.out.println("No pair found.");
        }
    }
}
