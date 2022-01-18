package level1.이상한_문자_만들기;

public class Solution {

	public String solution(String s) {

		String[] str = s.split("");

		String answer = "";

		int idx = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(" ")) {
				idx = 0;
			}
			if (idx % 2 == 0) {
				str[i] = str[i].toUpperCase();
				idx++;
			}
			if (idx % 2 != 0) {
				str[i] = str[i].toLowerCase();
				idx++;
			}
			answer += str[i];
		}
		return answer;
	}
}







