package com.example.javaproject2.algorithm.codeup;

import java.util.Scanner;

public class CodeUp1361 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("**");
        }
    }
}
