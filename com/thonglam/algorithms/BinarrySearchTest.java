package com.thonglam.algorithms;

public class BinarrySearchTest {



    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // Calculate the middle index without overflow
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;  // Target found
            } else if (arr[mid] < target) {
                start = mid + 1;  // Search in the right half
            } else {
                end = mid - 1;  // Search in the left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16};
        int target = 12;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Target element not found!");
        } else {
            System.out.println("Target element found at index: " + result);
        }
    }
    }
