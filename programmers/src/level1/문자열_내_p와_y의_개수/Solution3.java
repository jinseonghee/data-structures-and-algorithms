package level1.문자열_내_p와_y의_개수;

public class Solution3 {

	boolean solution(String s) {

		return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;
	}
}
