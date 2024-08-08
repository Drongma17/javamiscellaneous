package com.thonglam.algorithms;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;

            // Move elements of arr[i+1...j], that are greater than key, to one position ahead of their
            // current position
            while (i > -1 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Before Insertion Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        insertionSort(arr);

        System.out.println("\nAfter Insertion Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
