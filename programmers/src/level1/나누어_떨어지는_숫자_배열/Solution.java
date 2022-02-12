package level1.나누어_떨어지는_숫자_배열;

import java.util.Arrays;

public class Solution {

	public static int[] solution(int[] arr, int divisor) {

		int[] resultIntArray = Arrays.stream(arr)
			.filter(it -> it % divisor == 0)
			.sorted()
			.toArray();

		if (resultIntArray.length == 0) {
			return new int[] {-1};
		}

		return resultIntArray;
	}

	public static void main(String[] args) {
		Arrays.stream(solution(new int[] {2, 36, 1, 3}, 1)).forEach(System.out::println);
	}
}

