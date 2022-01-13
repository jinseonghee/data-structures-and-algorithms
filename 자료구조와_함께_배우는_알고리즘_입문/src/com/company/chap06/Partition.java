package com.company.chap06;

import static com.sun.tools.javac.jvm.ByteCodes.*;

import java.util.Scanner;

public class Partition {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void partition(int[] a, int n) {
		int pl = 0; //왼쪽 커서
		int pr = n - 1; //오른쪽 커서
		int x = a[n / 2]; //피벗(가운데 위치의 값)

		do {
			while (a[pl] < x) pl ++;
			while (a[pr] > x) pr --;
			if ( pl <= pr)
				swap(a, pl++, pr --);
		}while (pl <= pr);

		System.out.println("피벗의 값은 " + x + "입니다.");

		System.out.println("피벗 이하의 그룹");
		for(int i = 0; i <= pl - 1; i++) // a[0] ~ a[pl - 1]
			System.out.println(a[i] + " ");
		System.out.println();

		if(pl > pr + 1){
			System.out.println("피벗과 일치파는 그룹");
			for(int i = pr + 1; i <= pl - 1; i++) // a[pr + 1] ~ a[pl - 1]
				System.out.println(a[i] + " ");
			System.out.println();
		}

		System.out.println("피벗 이상의 그룹");
		for(int i = pr + 1; i < n; i++) // a[pr + 1] ~ a[n - 1]
			System.out.println(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("셀 정렬(버전1)");
		System.out.print("요솟수 : ");
		int nx = scan.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}

		partition(x, nx);
	}
}
