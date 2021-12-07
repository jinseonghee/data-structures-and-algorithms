package level1.짝수와_홀수;

public class Solution {

    public static String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        }
        if (num % 2 != 0) {
            answer = "Odd";
        }
        return answer;
    }
}