package level1.서울에서_김서방_찾기;

public class Solution2 {

	public String solution(String[] seoul) {

		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("kim")) {
				answer = "김서방은 " + i + "에 있다.";
			}

		}
		return answer;
	}
}