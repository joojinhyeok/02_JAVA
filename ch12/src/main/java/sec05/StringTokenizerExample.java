package sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍, 박연수";
        StringTokenizer st1 = new StringTokenizer(data1, "&,");

        System.out.println("data1의 이름 목록:");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken().trim());
        }

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st2 = new StringTokenizer(data2, "/");

        System.out.println("\ndata2의 이름 목록:");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken().trim());
        }
    }
}