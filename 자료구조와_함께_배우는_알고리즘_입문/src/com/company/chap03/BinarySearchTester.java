package com.company.chap03;

import java.util.Arrays;
import java.util.Scanner;

// Arrays.binarySearch로 이진 검색
public class BinarySearchTester {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수 : ");

		int num = scan.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열

		System.out.println("오름차순으로 입력해 주세요.");

		System.out.print("x[0]: "); // 배열의 첫 요소 먼저 입력
		x[0] = scan.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = scan.nextInt();
			} while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력.
		}

		System.out.print("검색할 값 : "); // 키 값을 입력 받음
		int ky = scan.nextInt();

		int idx = Arrays.binarySearch(x, ky); // 배열 x에서 키 값이 Ky인 요소를 검색

		if (idx < 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다. ");
	}
}
