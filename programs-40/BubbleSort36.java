package com.shivangani;

public class BubbleSort36 {
    public static void bubblesort(int [] arr) {
        int len = arr.length;
        int temp = 0;

        for(int i = 0; i <= len; i++) {
            for(int j = 0; j < len-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String [] args) {
        int [] arr = {10, 6, 12, 18, 9, 1 };
        bubblesort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
