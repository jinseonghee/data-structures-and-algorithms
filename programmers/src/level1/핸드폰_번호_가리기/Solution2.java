package level1.핸드폰_번호_가리기;

public class Solution2 {

	public String solution(String phone_number) {

		char[] ch = phone_number.toCharArray();
		for (int i = 0; i < ch.length - 4; i++) {
			ch[i] = '*';
		}
		return String.valueOf(ch);
	}
}
