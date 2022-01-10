package level1.최대공약수와_최소공배수;

import java.util.Arrays;

public class Solution2 {

	public static int[] solution(int n, int m) {

		int[] answer = new int[2];

		for (int i = 1; i < n + m; i++) {
			if (n % i == 0 && m % i == 0) {
				answer[0] = i;
				answer[1] = n * m / answer[0];
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(2, 5)));
	}
}
