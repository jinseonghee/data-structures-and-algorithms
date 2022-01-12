package level1.행렬의_덧셈;

import java.util.Arrays;

public class Solution {

	public static int[][] solution(int[][] arr1, int[][] arr2) {

		int[][] answer = new int[arr1.length][arr1[0].length]; //배열변수.length는 행의 개수, 배열변수[인덱스].length는 각 행이 가지고 있는 열의 개수

		for (int i = 0; i < arr1.length; i++) { // arr1의 행의 길이 만큼 돌린다.
			for (int j = 0; j < arr1[i].length; j++) { //arr1의 열의 길이 만큼 돌린다.
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.print(Arrays.deepToString(answer));
		return answer;
	}

	public static void main(String[] args) {

		solution(new int[][] {{1, 2}, {2, 3}}, new int[][] {{3, 4}, {5, 6}});
	}
}
