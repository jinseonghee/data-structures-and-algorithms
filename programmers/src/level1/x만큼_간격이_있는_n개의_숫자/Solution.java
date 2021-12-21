package level1.x만큼_간격이_있는_n개의_숫자;

public class Solution {

	public long[] solution(int x, int n) {

		long[] answer = new long[n];
		long x1 = x;

		for (int i = 0; i < n; i++) {
			answer[i] = x1 * (i + 1);
		}
		return answer;
	}
}
