package com.dsa.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 9,3,7,2,8,1,5,4,6};
        mergeSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    /*
        The time complexity of merge sort is as follows:

        Worst-case time complexity: O(n log n)
        Average-case time complexity: O(n log n)
        Best-case time complexity: O(n log n)
     */
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;

            // Divide the array into two halves
            int[] left = new int[mid];
            int[] right = new int[n - mid];

            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, n - mid);

            // Recursively sort each half
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted halves
            merge(arr, left, right);

        }
    }

    static void merge(int[] arr, int [] left, int[] right){
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }

        while( i < left.length){
            arr[k++] = left[i++];
        }

        while ( j < right.length){
            arr[k++] = right[j++];
        }
    }
}
