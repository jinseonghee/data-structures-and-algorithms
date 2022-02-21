package level1.내적;

public class Solution {

	public static int solution(int[] a, int[] b) {

		int result = 0;
		int answer = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {
				result += a[i] * b[j];
				i++;
			}
			answer = result;
		}
		return answer;
	}

	public static void main(String[] args) {

		System.out.println(solution(new int[]{1, 2, 3, 4}, new int[] {-3, -1, 0, 2}));
	}
}


