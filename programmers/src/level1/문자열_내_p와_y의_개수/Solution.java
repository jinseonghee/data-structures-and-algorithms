package level1.문자열_내_p와_y의_개수;

public class Solution {

	boolean solution(String s) {

		boolean answer = true;
		s.toUpperCase();
		int count = 0;
		int count1 = 0;
		char sChar = 'P';
		char sChar1 = 'Y';

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == sChar) {
				count++;
			}
			if (s.charAt(i) == sChar1) {
				count1++;
			}
			answer = count == count1 ? true : false;
		}
		return answer;
	}
}
