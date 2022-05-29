package level1.삼진법_뒤집기;

import java.util.Scanner;

public class Solution {

	public static int solution(int n) {
		int answer = 0;

		String intToBinary = Integer.toBinaryString(n);
		String stringToTrinary = Integer.toString(n , 3);

		StringBuilder sb = new StringBuilder(stringToTrinary);

		String reverseStr = sb.reverse().toString();

		answer = Integer.parseInt(reverseStr, 3);

		return answer;
	}

	public static void main(String[] args) {

		System.out.println(solution(125));

	}
}
