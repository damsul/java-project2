package com.example.javaproject2.algorithm.codeup;

import java.util.Scanner;

public class CodeUp1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        float F = 9 / 5.0f * C + 32;
        System.out.printf("%.3f", F);
    }
}