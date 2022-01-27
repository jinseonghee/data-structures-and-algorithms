package level1;

public class 문자열_내_p와_y의_개수 {

	boolean solution(String s) {

		boolean answer = true;
		int count = 0;
		int count1 = 0;
		String s1 = s.toUpperCase();
		char sChar = 'P';
		char sChar1 = 'Y';

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == sChar) {
				count++;
			}
			if (s1.charAt(i) == sChar1) {
				count1++;
			}
			answer = count == count1 ? true : false;
		}
		return answer;
	}
}
