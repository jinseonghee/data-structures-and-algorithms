package level1.시저_암호;

public class Solution2 {

	public static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) { //소문자
				ch = (char)((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) { //대문자
				ch = (char)((ch - 'A' + n) % 26 + 'A');
			}
			answer += ch;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
	}
}
