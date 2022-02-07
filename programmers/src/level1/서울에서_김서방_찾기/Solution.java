package level1.서울에서_김서방_찾기;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static String solution(String[] seoul) {


        //Arrays.asList(seoul);

        int result = Arrays.binarySearch(seoul, "kim");
        //int result = Arrays.asList(seoul).indexOf("kim");

        return "김서방은 " + result + "에 있다.";
    }

    public static void main(String[] args) {

        System.out.println(solution(new String[]{"jane", "kim" ,"tttt"}));
    }
}
