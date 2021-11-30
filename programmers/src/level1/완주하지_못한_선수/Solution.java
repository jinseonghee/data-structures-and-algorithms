package level1.완주하지_못한_선수;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public String solution(String[] participant, String[] completion) {

        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String player : participant) {
            hashMap.put(player, hashMap.getOrDefault(player, 0) + 1); // getOrDefault - 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        }

        for(String player : completion) {
            hashMap.put(player, hashMap.get(player) -1);
        }

        for(String player : hashMap.keySet()) {
            if(hashMap.get(player) != 0) {
                return answer = player;
            }
        }
        return answer;
    }

    public String solution2 (String[] participant, String[] completion) {

        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for(i = 0; i < completion.length; i ++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[i];
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        //solution.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"kiki", "eden"});
        //System.out.println(solution.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"kiki", "eden"}));
        System.out.println(solution.solution2(new String[] {"leo", "kiki", "eden"}, new String[] {"kiki", "eden"}));
    }
}
