package com.example.javaproject2.algorithm.codeup.basic;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = ' ';
        while (c != 'q') {
            c = sc.next().charAt(0);
            System.out.println(c);
        }
    }
}