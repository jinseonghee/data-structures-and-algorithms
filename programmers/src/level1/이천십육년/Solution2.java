package level1.이천십육년;

import java.time.LocalDate;

public class Solution2 {

	public String solution(int a, int b) {
		return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
	}

	public static void main(String[] args) {

		System.out.println(new Solution2().solution(5, 24));
	}
}
