package level1.문자열_내_p와_y의_개수;

public class Solution2 {

	boolean solution(String s) {
		s = s.toUpperCase();

		return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
	}
}
