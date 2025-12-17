package org.example.test.dsaString;

import java.sql.Time;
import java.util.Arrays;

public class ShortStringCharacter {

    public static void main(String[] args) {
        String str = "revati";
        sortString(str);
    }


//    Bubble Sort (Your current code)
//    Time Complexity: O(n²)
//    Space Complexity: O(n) (for the char array and result string)
    public static void sortString(String str){
      char[] arr=  str.toCharArray();
      for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr.length-i-1; j++){
              if(arr[j]>arr[j+1]){
                  char temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
          }
      }
      // Arrays.sort(arr);
      String ans=new String(arr);
      System.out.println(ans);
    }

//    Selection Sort
//    Time Complexity: O(n²)
//    Space Complexity: O(n)
    public static void sortStringSelection(String str){
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length - 1; i++){
            int minIdx = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            char temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        String result = new String(arr);
        System.out.println(result);
    }

//    Counting Sort (Best for limited character set like ASCII)
//    Time Complexity: O(n + k), where k is character range (e.g., 256 for extended ASCII)
//    Space Complexity: O(k)
        public static void sortStringCounting(String str){
            int[] count = new int[256];  // ASCII size
            for(char ch : str.toCharArray()){
                count[ch]++;
            }

            StringBuilder sorted = new StringBuilder();
            for(int i = 0; i < 256; i++){
                while(count[i]-- > 0){
                    sorted.append((char)i);
                }
            }
            System.out.println(sorted.toString());
        }


//    Using Java's Built-in Arrays.sort (Timsort)
//    Time Complexity: O(n log n)
//    Space Complexity: O(n)


    public static void sortStringBuiltIn(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr); // Uses Dual-Pivot Quicksort (or Timsort for objects)
        System.out.println(new String(arr));
    }

}
