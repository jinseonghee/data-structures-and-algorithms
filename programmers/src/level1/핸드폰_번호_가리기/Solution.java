package level1.핸드폰_번호_가리기;

public class Solution {

	public String solution(String phone_number) {

		String phone = phone_number.substring(phone_number.length() - 4);
		String phone1 = phone_number.substring(0, phone_number.length() - 4);

		String replaceStar = "";

		for(int i =0; i < phone1.length(); i++) {
			replaceStar  += "*";
		}

		String answer = replaceStar + phone;

		return answer;
	}
}

