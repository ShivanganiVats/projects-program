package com.Shivangani;
import java.util.*;
public class MergeSort {
    void merge(int[] arr, int top, int bottom, int mid) {
        int a1 =  bottom - top + 1;
        int a2 = mid - bottom;

        int b[] = new int[a1];
        int c[] = new int[a2];

        for(int i =0; i < a1; i++)
            b[i] = arr[top + i];
        for(int j = 0; j < a2; j++)
            c[j] = arr[bottom + 1 + j];

        int i, j, k;
        i = 0;
        j = 0;
        k = top;

        while(i < a1 && j < a2) {
            if(b[i] <= c[j]) {
                arr[k] = b[i];
                i++;
            }
            else {
                arr[k] = c[j];
                j++;
            }
            k++;
        }

        while(i < a1) {
            arr[k] = b[i];
            i++;
            k++;
        }

        while (j < a2) {
            arr[k] = c[j];
            j++;
            k++;
        }
    }

    void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String [] args) {
        int[] arr = {1, 10, 15, 18, 2, 3, 7, 8};

        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
