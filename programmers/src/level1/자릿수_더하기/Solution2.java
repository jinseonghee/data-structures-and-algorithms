package level1.자릿수_더하기;

public class Solution2 {

	public int solution(int n) {

		int answer = 0;
		while (n > 0) {
			answer += n % 10;
			n /= 10;
		}
		return answer;
	}
}
