package com.Shivangani;


    import java.util.Arrays;

    public class InsertionSort {
        public static void insertionsort(int[] arr) {
            int size = arr.length;

            for(int i = 1; i <= size-1; i++) {
                int key = arr[i];
                int j = i-1;
                while(j >= 0 && arr[j] > key) {
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = key;
            }
        }

        public static void main(String [] args) {
            int[] arr = {5, 6, 12, 3, 1, 8};
            InsertionSort is = new InsertionSort();
            is.insertionsort(arr);
            System.out.println("Sorted array is : ");
            System.out.println(Arrays.toString(arr));
        }
    }

