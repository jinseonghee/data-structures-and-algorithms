package level1.소수_만들기;

public class Solution {

	public static int solution(int[] nums) {

		int answer = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];

					answer += isPrime(sum) ? 1 : 0;
				}
			}
		}

		return answer;
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			// 나눠 떨어질 경우
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(new int[]{1, 2, 3, 4});
	}
}

