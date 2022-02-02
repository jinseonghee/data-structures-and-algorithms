package level1.약수의_개수와_덧셈;

public class Solution {

	public static int solution(int left, int right) {
		int answer = 0;
		int count = 0;

		for (int i = 13; i <= right; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
					count++;
				}
			}
			if (count % 2 == 0) {
				answer += i;
			} else {
				answer += i * -1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(13, 17));
	}
}
