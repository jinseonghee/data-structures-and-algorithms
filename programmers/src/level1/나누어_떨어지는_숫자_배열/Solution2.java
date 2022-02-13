package level1.나누어_떨어지는_숫자_배열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {

	public static int[] solution(int[] arr, int divisor) {

		ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
		if (arr[i] % divisor == 0) {
			ret.add(arr[i]);
		}
	}

        return ret.stream().mapToInt(i -> i).toArray();
}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution((new int[]{ 5, 9, 7, 10 }),5)));
	}
}


