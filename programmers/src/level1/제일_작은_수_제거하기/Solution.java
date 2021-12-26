package level1.제일_작은_수_제거하기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

	public int[] solution(int[] arr) {

		if (arr.length <= 1)
			return new int[] {-1};

		int minValue = IntStream.of(arr).min().getAsInt();
		IntStream arrIntStream = IntStream.of(arr);

		return arrIntStream
			.filter(it -> it != minValue)
			.toArray();
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Solution().solution(new int[] {10})));
	}
}

