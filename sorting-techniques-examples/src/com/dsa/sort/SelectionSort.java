package com.dsa.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 9,3,7,2,8,1,5,4,6};

        selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    /*
        The time complexity of the selection sort algorithm is as follows:
        ------------------------------------------------------------------
        Worst-case time complexity: O(n²)
        Average-case time complexity: O(n²)
        Best-case time complexity: O(n²)
     */

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted portion of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
