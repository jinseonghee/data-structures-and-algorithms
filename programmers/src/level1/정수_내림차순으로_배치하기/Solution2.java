package level1.정수_내림차순으로_배치하기;

import java.util.Comparator;

public class Solution2 {

	public static long solution(long n) {

		return Long.parseLong(String.valueOf(n).chars().mapToObj(ch -> (char)ch)
			.sorted(Comparator.reverseOrder())
			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append) //appendCodePoint 해당 아스키코드이 character를 추가한다.
			.toString());
	}

	public static void main(String[] args) {

		System.out.println(solution(1234567));
	}
}

