package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerStrEx2 {

    void inputStrAndPlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력해주세요.");
        System.out.print("첫번째 숫자: ");
        System.out.println("첫번째 숫자는 " + sc.nextInt() + " 입니다.");
        System.out.print("두번째 숫자: ");
        System.out.println("두번째 숫자는 " + sc.nextInt() + " 입니다.");
    }
}
