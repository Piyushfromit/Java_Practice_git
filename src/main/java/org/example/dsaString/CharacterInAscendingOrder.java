package org.example.dsaString;


public class CharacterInAscendingOrder {

    public static void main(String[] args) {
        String str = "kjhasddaswdkjh";
        charInAscOrder1(str);
        charInAscOrder2(str);
        charInAscOrder3(str);
    }


    // Selection Short
    public static void charInAscOrder1(String str) {

        char[] chars = new char[str.length()];
        // Copy string to char array
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        // Selection sort the char array
        for (int i = 0; i < chars.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] < chars[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap if a smaller element was found
            if (minIndex != i) {
                char temp = chars[i];
                chars[i] = chars[minIndex];
                chars[minIndex] = temp;
            }
        }

        // Print sorted chars
        for (int i = 0; i < str.length(); i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }


    // Bubble Short
    public static void charInAscOrder2(String str) {
        char[] chars = new char[str.length()];
        // Copy string to char array
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        // Bubble sort the char array
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - i -1; j++) {
                if (chars[j] > chars[j+1]) {
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }
        }
        // Print sorted chars
        for (int i = 0; i < str.length(); i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    //  Bubble Short Optimised
    public static void charInAscOrder3(String str) {

        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        // Optimized Bubble Sort with early exit
        boolean swapped;
        for (int i = 0; i < chars.length - 1; i++) {
            swapped = false;
            // Optimization: reduce the range each time  // en every loop, the greatest will go at the end
            for (int j = 0; j < chars.length - i -1; j++) {
                if (chars[j] > chars[j+1]) {
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // Exit early if no swaps occurred
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(chars[i]);
        }

    }

//    public static void main(String[] args) {
//        // Example string
//        String str = "kjhasddaswdkjh";
//
//        // Convert string to character array
//        char[] arr = str.toCharArray();
//
//        quickSort(arr, 0, arr.length - 1);
//
//        // Convert sorted char array back to string
//        String sortedStr = new String(arr);
//        System.out.println("Sorted String: " + sortedStr);
//    }


    // approach 3  Using Quick Sort algorithm
    // Function to perform Quicksort on character array
    public static void quickSort(char[] arr, int low, int high) {
        if (low < high) {
            // Get the partition index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);  // Left part
            quickSort(arr, pivotIndex + 1, high); // Right part
        }
    }

    // Partition function (Lomuto's partition scheme)
    private static int partition(char[] arr, int low, int high) {
        char pivot = arr[high]; // Choosing the last element as the pivot
        int i = low - 1; // Pointer for smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place the pivot in the correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap function to swap two elements in the array
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}