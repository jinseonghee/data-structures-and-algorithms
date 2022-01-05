package com.company.chap03.practice;

import java.util.Scanner;

public class Question1 {

	static int seqSearch(int[] a, int n, int key) {
		int i;

		a[n] = key; // 보초를 추가

		/*
			for(int i = 0; i < n; i++) {
				if(a[i] == key) {
					return i;
				}
			}
			return -1;
		}
		 */

		for (i = 0; a[i] != key; i++)
		;

		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("요솟수 : ");

		int num = scan.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}

		System.out.print("검색할 값 : ");

		int ky = scan.nextInt();
		int idx = seqSearch(x, num, ky);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다. ");
	}
}


