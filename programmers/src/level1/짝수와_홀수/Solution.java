package level1.짝수와_홀수;

public class Solution {

    String evenOrOdd(int num) {
        return num % 2 == 0 ? "Even": "Odd";
    }

    public static void main(String[] args) {
        //String str = "1 2 3 4";
        Solution evenOrOdd = new Solution();

        System.out.println("결과 : " + evenOrOdd.evenOrOdd(6));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(5));
    }
}