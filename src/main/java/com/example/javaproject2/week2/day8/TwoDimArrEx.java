package com.example.javaproject2.week2.day8;

import java.util.Arrays;

public class TwoDimArrEx {

    public static void printArr(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("---------");
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        printArr(arr);

        arr[0][0] = 1;
        arr[0][2] = 2;
        arr[1][0] = 4;
        printArr(arr);

        arr[1][1] = 5;
        printArr(arr);


    }

}
