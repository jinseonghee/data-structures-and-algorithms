package level1.소수_찾기;

public class Solution {

	public static int solution(int n) {
		//에라토스테네스 체
		int answer = 0;
		int[] arr = new int[n + 1]; // 배열의 모든 값은 0으로 초기화

		for (int i = 2; i <= n; i++) {
				if (arr[i] == 0) { //체크되지 않은 값인 경우 소수
					answer++;
					for(int j = i; j <= n; j = j + i) { //현재 i값의 배수들은 모두 체크 처리(소수가 아님)
						arr[j] = 1; //배수는 소수가 아니므로 체크
					}
				}
			}

		return answer;
	}

	public static void main(String[] args) {

		System.out.println(solution(10));
	}
}

