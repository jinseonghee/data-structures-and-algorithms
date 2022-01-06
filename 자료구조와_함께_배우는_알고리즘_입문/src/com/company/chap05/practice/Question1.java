package com.company.chap05.practice;

import java.util.Scanner;

public class Question1 {

	static int factorial (int n) {

		int temp = 1;

		while (n > 1)
			temp *= n--;
		return (temp);
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int x = scan.nextInt();

		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}
}
