package level1.정수_제곱근_판별;

public class Solution2 {

	public static long solution(long n) {

		double i = Math.sqrt(n);
		
		return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
	}
}
