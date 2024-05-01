package com.dsa.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,7,5,2,4,3,1};

        insertionSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    /*
        The time complexity of insertion sort is as follows:

        Worst-case time complexity: O(n²) when the input array is in reverse order
        Average-case time complexity: O(n²)
        Best-case time complexity: O(n) when the input array is already sorted
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key into its correct position
            arr[j + 1] = key;
        }
    }
}
