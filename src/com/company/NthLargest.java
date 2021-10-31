package com.company;

import java.util.Arrays;

public class NthLargest {
    public static void main(String[] args) {
        int[] number = {3, 5, 99, 22, 78, 89};

        System.out.println("The nth largest number is: " + nthLargest(number, 2));
    }

    public static int nthLargest(int[] arr, int n) {
        // Sort the array
        Arrays.sort(arr);

        // return the index of that value
        return arr[arr.length - n];
    }
}
