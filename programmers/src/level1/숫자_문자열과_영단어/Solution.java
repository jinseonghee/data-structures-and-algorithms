package level1.숫자_문자열과_영단어;

//숫자 문자열과 영단어
public class Solution {

    public static int solution (String s) {

        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] alphabets = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(alphabets[i], digits[i]);
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        System.out.println(solution("one4seveneight"));
    }
}


