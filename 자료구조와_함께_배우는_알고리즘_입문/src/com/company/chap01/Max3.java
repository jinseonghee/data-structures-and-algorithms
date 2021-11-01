package com.company.chap01;

import java.util.Scanner;

//3개의 정숫값을 입력하고 최댓값을 구합니다.
class Max3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("세 개 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : ");
        int a = scan.nextInt();
        System.out.print("b의 값 : ");
        int b = scan.nextInt();
        System.out.print("c의 값 : ");
        int c = scan.nextInt();


        //a ,b, c 의 최댓값을 구하여 max에 대입
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
