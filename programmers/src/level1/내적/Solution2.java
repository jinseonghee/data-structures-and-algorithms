package level1.내적;

public class Solution2 {

	public static int solution(int[] a, int[] b) {
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum+= a[i]*b[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 2, 3, 4}, new int[] {-3, -1, 0, 2}));
	}
}
