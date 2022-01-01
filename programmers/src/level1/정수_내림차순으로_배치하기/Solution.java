package level1.정수_내림차순으로_배치하기;

import java.util.Arrays;

public class Solution {

	public long solution(long n) {
		String s = String.valueOf(n);
		String temp = "";
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		for (int i = chars.length - 1; i >= 0; i--)
			temp += chars[i];
		return Long.parseLong(temp);
	}

	public static void main(String[] args) {
		System.out.println(new Solution().solution(118372L));
	}
}

