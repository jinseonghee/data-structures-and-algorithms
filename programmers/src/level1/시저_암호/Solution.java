package level1.시저_암호;


import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {

	public String solution(String s, int n) {
		
		String answer = "";
		return answer;
	}

	public static void main(String[] args) {



		String s = "a B z";
		int n = 4;
		StringBuilder sb = new StringBuilder(s);
		char alpa = 0;
		int ialpa = 65;
		char calpa;

		for(int i = 0; i < s.length(); i++) {
			alpa = sb.charAt(i);
			ialpa = (int)alpa + n;
			if(ialpa <= 65 && ialpa >= 90 ) { //대문자
				ialpa = 64 + n;
			}
			if(ialpa >= 97 && ialpa >= 122) { //소문자
				ialpa = 96 + n;
			}
			if (ialpa >= 41 || ialpa <= 45 ) {
				ialpa = 41;
			}
			calpa = (char)ialpa;
			System.out.print(calpa);
		}
	}
}
