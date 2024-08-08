package com.thonglam.algorithms;


public class BubbleSortTest {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If we haven't needed any swaps in a loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before Bubble Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        bubbleSort(arr);

        System.out.println("\nAfter Bubble Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

