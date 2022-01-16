package com.shivangani;
import java.util.*;
public class SelectionSort {
    public static void selectionsort(int[] arr) {
        int size = arr.length;

        for(int i = 0; i < size-1; i++) {
            int min = i;
            for(int j = i+1; j < size; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String [] args) {
        int[] arr = {15, 9, 16, 1, 8, 3};
        SelectionSort ss = new SelectionSort();
        ss.selectionsort(arr);
        System.out.println("Sorted Array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
