package level1.자연수_뒤집어_배열로_만들기;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {

	public int[] solution(long n) {

		int[] n1 = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(n1));

		for (int i = 0; i < n1.length / 2; i++) {
			int t = n1[i];
			n1[i] = n1[n1.length - i - 1];
			n1[n1.length - i - 1] = t;
		}

		int[] answer = n1;

		return answer;
	}
}
