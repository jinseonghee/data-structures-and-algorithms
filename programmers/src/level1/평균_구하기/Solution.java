package level1.평균_구하기;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static double solution(int[] arr) {
        return (double) Arrays.stream(arr).average().orElse(0);
    }

    public static void main(String[] args) {

        int x[] = {1, 2, 3, 4};
        System.out.println("평균값 : " + solution(x));
    }
}

