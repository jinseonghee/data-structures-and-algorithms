package level1.문자열_다루기_기본;

public class Solution {

	public static boolean solution(String s) {

		boolean answer = true;

		if ( s.length() != 4 && s.length() != 6) {
			return false;
		}

		for(int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				answer = false;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		System.out.println(solution("1234"));
	}
}
