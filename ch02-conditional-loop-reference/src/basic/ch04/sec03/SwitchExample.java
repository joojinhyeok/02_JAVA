package basic.ch04.sec03;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        // Random 라이브러리 활용 랜덤값 출력
        int num = (int)(Math.random()*5 + 1);

        switch(num){
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            case 6:
                System.out.println("6번이 나왔습니다.");
                break;
        }
    }
}
