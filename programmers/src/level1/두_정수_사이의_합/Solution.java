package level1.두_정수_사이의_합;

import java.util.Random;

public class Solution {

    public static long solution(int a, int b) {

        long answer = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        if (a > b || a == b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(3,5));
    }
}