package level1.수박수박수박수박수박수;

public class Solution {

    public static String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            }

            if (i % 2 == 1) {
                answer += "박";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(4));
    }
}
