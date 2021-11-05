package com.company.chap02.practice;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.Scanner;

public class Question3 {

    static int sumOf(int[] a) {

        int sum = 0;
        for(int i = 0; i < a.length; i ++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int num = scan.nextInt();

        System.out.print("요소를 입력 하세요 : ");
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println("전 요소의 합계는 : " + sumOf(a));
    }
}

