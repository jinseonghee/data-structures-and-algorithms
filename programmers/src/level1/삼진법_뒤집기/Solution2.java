package level1.삼진법_뒤집기;

public class Solution2 {

	public static int solution(int n) {
		String a = "";

		while(n > 0){
			a = (n % 3) + a;
			n /= 3;
		}
		a = new StringBuilder(a).reverse().toString();

		return Integer.parseInt(a,3);
	}

	public static void main(String[] args) {

		System.out.println(solution(45));
	}
}
