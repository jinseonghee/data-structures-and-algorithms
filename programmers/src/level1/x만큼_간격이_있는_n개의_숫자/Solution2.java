package level1.x만큼_간격이_있는_n개의_숫자;

public class Solution2 {

	public long[] solution(int x, int n) {

		long[] answer = new long[n];

		for (int i = 1; i <= n; i++) {
			answer[i - 1] = (long)x * i;
		}
		return answer;
	}
}
