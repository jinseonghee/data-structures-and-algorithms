package level1.소수_찾기;

public class Solution {
	public static int solution(int n) {

		int answer = 0;

		for (int j = 2; j <= n; j++) {
			boolean isPrime = true;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		System.out.println(solution(10));
	}
}

