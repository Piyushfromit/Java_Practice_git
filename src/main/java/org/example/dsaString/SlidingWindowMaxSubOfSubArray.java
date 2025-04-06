package org.example.dsaString;



public class SlidingWindowMaxSubOfSubArray {

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        System.out.println("Max sum of subarray of size " + k + ": " + maxSum(nums, k));
    }


    public static int maxSum(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = 0;

        // Initial window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k]; // Add new, remove old
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
