package level1.평균_구하기;

import java.util.Scanner;

public class Solution {

    public static double solution(int[] arr) {

        double answer = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        answer = sum / arr.length;

        return answer;
    }
}