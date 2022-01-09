package level1.최대공약수와_최소공배수;

import java.util.Arrays;

public class Solution {

	public static int[] solution(int n, int m) {

		int[] answer = {};

		int gcd1 = gcd(n, m);
		int lcm = n * m / gcd1;

		answer = new int[] {gcd1, lcm};

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

		System.out.println(Arrays.toString(solution(4,20)));
	}
}
