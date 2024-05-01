package com.dsa.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
       int[] arr = { 9,3,7,2,8,1,5,4,6};

        bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    /*

      The time complexity of the bubble sort algorithm is as follows:
      ---------------------------------------------------------------
      Worst-case time complexity: O(n²) when the input array is in reverse order, so every pair of elements needs to be swapped in each pass
      Average-case time complexity: O(n²)
      Best-case time complexity: O(n) when the input array is already sorted

    */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already in place, so we don't need to compare them again
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
