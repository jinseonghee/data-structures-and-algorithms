package level1.두_개_뽑아서_더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static int[] solution(int[] numbers) {

		int result;

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				result = numbers[i] + numbers[j];
				if (!list.contains(result)) {
					list.add(result);
				}
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {

		System.out.println(solution(new int[] {2, 1, 3, 4, 1}));
	}
}
