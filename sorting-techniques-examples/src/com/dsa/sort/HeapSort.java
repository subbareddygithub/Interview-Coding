package com.dsa.sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = { 9,3,7,2,8,1,5,4,6};
        heapSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    static void heapSort(int[] arr){
        int n = arr.length;

        // Build a max-heap from the input array
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }

        // Extract elements from the heap one by one
        for(int i = n-1; i > 0; i--){
            // Swap the root (maximum element) with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i , 0);
        }
    }

    static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Find the largest element among the root, left child, and right child
        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        // If the largest element is not the root, swap them and heapify the affected subtree
        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
}
