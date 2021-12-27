package level1.이천십육년;

public class Solution {

	public String solution(int a, int b) {

		String[] day_days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int month_day[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //2016년은 윤년이기 때문에 2월이 29

		int total_day = 0;

		//1월 1일 ~ 4월 까지의 날짜 총 합
		for (int i = 1; i < a; i++) {
			total_day += month_day[i - 1];
		}

		//5월 달 일 수 총 합
		total_day += b - 1;

		//1월 1일이 금요일이기 때문에 5를 더 함
		int answer_day = (5 + total_day) % 7;

		String answer = day_days[answer_day];

		return answer;
	}
}

