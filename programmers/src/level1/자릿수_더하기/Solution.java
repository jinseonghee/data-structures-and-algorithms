package level1.자릿수_더하기;

public class Solution {

	public int solution(int n) {

		int answer = 0;
		String n1 = Integer.toString(n);

		for (int i = 0; i < n1.length(); i++) {
			answer += Integer.parseInt(n1.substring(i, i + 1));
		}
		return answer;
	}
}
