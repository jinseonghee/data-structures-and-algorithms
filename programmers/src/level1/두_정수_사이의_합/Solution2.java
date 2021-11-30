package level1.두_정수_사이의_합;

public class Solution2 {

    // 등차수열의 합에 의한 풀이
    public static long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private static long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

    public static void main(String[] args) {

        System.out.println(solution(3,3));
    }
}


