package level1.없는_숫자_더하기;

public class Solution2 {

	public static int solution(int[] numbers) {
		int sum = 45;
		for (int i : numbers) {
			sum -= i;
		}
		return sum;
	}
}
