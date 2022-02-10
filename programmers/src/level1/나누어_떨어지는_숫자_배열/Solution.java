package level1.나누어_떨어지는_숫자_배열;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {

	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		return answer;
	}

	public static void main(String[] args) {

		int[] arr = {5, 9, 7, 10};
		Arrays.sort(arr);
		int divisor = 5;
		int answer = 0;
		int[] digits = {};

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer = arr[i];
				digits = Stream.of(String.valueOf(answer).split(",")).mapToInt(Integer::parseInt).toArray();
				System.out.print(Arrays.toString(digits));
			}
		}
	}
}
