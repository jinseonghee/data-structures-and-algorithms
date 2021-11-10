package com.company.chap02.practice;

import java.util.Scanner;

public class Question5 {

    static void rcopy(int[] a, int[] b) {

        int num = a.length <= b.length ? a.length : b.length;
        for(int i = 0; i < num; i ++) {
            a[i] = b[b.length - i - 1];
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("a의 요솟수 : ");
        int numa = scan.nextInt();
        int a[] = new int[numa];

        for(int i = 0; i < numa; i++) {
            System.out.print("a[" + i + "] : " );
            a[i] = scan.nextInt();
        }

        System.out.print("b의 요솟수 : ");
        int numb = scan.nextInt();
        int b[] = new int[numb];

        for(int i = 0; i < numb; i++) {
            System.out.print("a[" + i + "] : " );
            b[i] = scan.nextInt();
        }

        rcopy(a, b);

        System.out.println("배열 b의 모든 요소를 배열 a에 역순 정렬");
        for(int i = 0; i < numa; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
