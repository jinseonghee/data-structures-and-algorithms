package com.company.chap05;

import java.util.Scanner;

//유클리드 호제법으로 최대공약수 구하기
public class EuclidGCD {

	//정수 x, y의 최대공약수를 구하여 반환한다.
	static int gcd(int x, int y) {
		if (y == 0)
			return x; // 최대공약수는 y가 0이면 x
		else
			return gcd(y, x % y);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("두 정수의 최대공약수를 구합니다. ");

		System.out.print("정수를 입력하세요: ");
		int x = scan.nextInt();
		System.out.print("정수를 입력하세요: ");
		int y = scan.nextInt();

		System.out.println("최대공약수는 " + gcd(x, y) + "입니다. ");
	}
}
