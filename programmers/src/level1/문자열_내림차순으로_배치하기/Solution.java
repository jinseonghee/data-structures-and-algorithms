package level1.문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Solution {

	public static String solution(String s) {

		char[] sArr = s.toCharArray();  // String을 정렬하기 위해 char[] 캐릭터 배열로 변형
		Arrays.sort(sArr); //문자를 뒤집기 위해 오름차순으로 정렬

		StringBuilder sb = new StringBuilder(String.valueOf(sArr));
		String answer = sb.reverse().toString();

		return answer;
	}

	public static void main(String[] args) {

		System.out.println(solution("Zcbdefg"));
	}
}
