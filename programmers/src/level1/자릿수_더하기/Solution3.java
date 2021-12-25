package level1.자릿수_더하기;

public class Solution3 {

	public int solution(int n) {

		int answer = 0;
		String[] array = String.valueOf(n).split("");
		for(String s : array){
			answer += Integer.parseInt(s);
		}
		return answer;
	}
}
