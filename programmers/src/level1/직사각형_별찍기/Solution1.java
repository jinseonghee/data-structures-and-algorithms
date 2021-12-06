package level1.직사각형_별찍기;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder(); // StringBuilder는 String과 문자열 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터에 더하는 방식으로 사용
        IntStream.range(0, a).forEach(s -> sb.append("*")); //IntStream.range는 0에서 a 사이의 integer를 차례대로 스트림으로 방출한다
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString())); //toString()이 호출되면 해당 문자열에 대한 String 객체를 생성해서 반환한다.
    }
}


