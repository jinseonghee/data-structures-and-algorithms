package level1.시저_암호;

public class Solution {

	public static String solution(String s, int n) {

		char alpa = 0;
		int ialpa = 0;
		char calpa = 0;
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			alpa = s.charAt(i);
			ialpa = (int)alpa + n;

			if (ialpa <= 65 && ialpa >= 90) { //대문자
				ialpa = 64 + n;
			}
			if (ialpa >= 97 && ialpa >= 122) { //소문자
				ialpa = 96 + n;
			}
			if (ialpa <= 32 || ialpa <= 57) {
				ialpa = 32;
			}

			calpa = (char)ialpa;
			answer += String.valueOf(calpa);
		}
		return answer;
	}

	public static void main(String[] args) {

		System.out.println(solution("A B", 1));
	}
}
