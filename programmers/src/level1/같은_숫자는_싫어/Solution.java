package level1.같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public int[] solution(int[] arr) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		int current = 10;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != current) {
				arrayList.add(arr[i]);
				current = arr[i];
			}
		}

		int[] answer = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}
		return answer;
	}
}
