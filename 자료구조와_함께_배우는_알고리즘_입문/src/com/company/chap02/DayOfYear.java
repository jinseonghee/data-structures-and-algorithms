package com.company.chap02;

import java.util.Scanner;

// 그 해 경과 일 수를 구함
public class DayOfYear {

    // 각 달의 일수
    static int[][] mdays = {
            { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년
    };

    // 서기 year년은 윤년인가? (윤년 : 1 / 평년 : 0)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d) {
        int days = d;

        for (int i = 1; i < m; i++)
            days += mdays[isLeap(y)][i - 1];
        return days;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다. ");

        do {
            System.out.print("년 : ");
            int year = scan.nextInt();
            System.out.print("월 : ");
            int month = scan.nextInt();
            System.out.print("일 : ");
            int day = scan.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));

            System.out.println("한 번 더 할까요? (1.예 / 0.아니요) : ");
            retry = scan.nextInt();
        } while (retry == 1);
    }
}
