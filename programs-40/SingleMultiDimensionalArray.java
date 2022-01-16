package com.Shivangani;

public class SingleMultiDimensionalArray {

    public static void main(String[] args) {

        //single-dimensional array

        int a[]= {10,20,30,40,50};
        for(int i = 0;i < 5; i++) {
            System.out.println("Elements of array a: " + a[i]);
        }

        //Multi-dimensional array

        int[][] b = { {0, 1}, {2, 3} };
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.println("Element of array b: [" + i + "][" + j + "] = " + b[i][j]);
            }
        }
    }
}
