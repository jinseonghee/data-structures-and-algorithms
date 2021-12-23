package level1.핸드폰_번호_가리기;

public class Solution3 {

	public String solution(String phone_number) {
		return phone_number.replaceAll(".(?=.{4})", "*");
		//. -> 임의의 문자 한 개
		// (?=.) -> 뒷쪽에 임의의 문자 한 개를 제외하고 선택
		// {숫자} -> 숫자 만큼의 자릿수
		// .(?=.{4}) ==> 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택
	}
}
