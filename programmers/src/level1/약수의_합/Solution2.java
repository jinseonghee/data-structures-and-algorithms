package level1.약수의_합;

import java.util.HashSet;

public class Solution2 {

	public static int solution(int n) {

		int answer = 0;
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = n; i > 0; i--) {
			if (n % i == 0) {
				set.add(i);
			}
		}

		for(Integer i:set){
			answer+=i;
		}
		return answer;
	}


	public static void main(String[] args) {
		System.out.println(solution(12));
	}
}

