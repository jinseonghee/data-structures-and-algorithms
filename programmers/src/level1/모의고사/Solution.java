package level1.모의고사;

//완전탐색 - 가능한 모든 경우의 수를 다 체크해서 정답을 찾는 방법
public class Solution {

    public int[] solution(int[] answers) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {

        int[] answer = {1, 2, 3, 4, 5};

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] result = {};

       for(int i = 0; i < answer.length; i ++) {
           for(int j = 0; j < first.length; j ++) {
               if(answer[i] == first[i]) {
                   result = answer;
                   System.out.println(first);
               }
           }
       }
    }
}
