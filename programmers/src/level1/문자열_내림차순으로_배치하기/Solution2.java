package level1.문자열_내림차순으로_배치하기;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution2 {

	public static String solution(String s) {

		return Stream.of(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
		//문자단위로 끊어서 그것을 역순으로 정렬하고 그것을 다시 문자열로 붙인다.
	}

	public static void main(String[] args) {

		System.out.println(solution("Zbcdefg"));
	}
}
