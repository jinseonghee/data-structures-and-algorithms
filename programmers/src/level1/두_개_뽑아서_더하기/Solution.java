package level1.두_개_뽑아서_더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static int[] solution(int[] numbers) {

		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		int answer;

		List<Integer> list = new ArrayList<>();

		for( int i = 0; i < numbers.length; i++) {
			for ( int j = i + 1; j < numbers.length; j++) {
				answer = numbers[i] + numbers[j];
				if(!list.contains(answer)) {
					list.add(answer);
				}
			}
		}
		return list.stream().mapToInt(i->i).toArray();
	}


	public static void main(String[] args) {

		System.out.println(solution(new int[] {2, 1, 3, 4, 1}));
	}
}
