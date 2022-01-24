package level1.정수_제곱근_판별;

public class Solution {

	public static long solution(long n) {

		long result = (long)Math.sqrt(n);
		long answer = (long)Math.pow(result + 1, 2);

		if (n == Math.pow(result, 2)) {
			return answer;
		}

		return -1;
	}

	public static void main(String[] args) {

		System.out.println(solution(3));
	}
}



