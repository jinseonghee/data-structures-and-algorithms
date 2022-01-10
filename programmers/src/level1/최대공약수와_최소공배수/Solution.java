package level1.최대공약수와_최소공배수;

import java.util.Arrays;

public class Solution {

	public static int[] solution(int n, int m) {

		int[] answer = new int[2];

		answer[0] = gcd(n, m);
		answer[1] = (n * m) / answer[0];

		return answer;

	}

	//최대공약수는 유클리드 호제법
	static int gcd(int x, int y) {
		if (y == 0)
			return x; // 최대공약수는 y가 0이면 x
		else
			return gcd(y, x % y);
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(4, 20)));
	}
}
