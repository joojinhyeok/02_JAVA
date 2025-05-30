package basic.ch04.sec02;

import java.awt.desktop.AboutEvent;
import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {
        // 1~6 사이의 값을 랜덤
        // Math.random: 0.0 ~ 1.0미만

        int num = (int)(Math.random() * 5) + 1;

        // 0~인자로 준값(bound)
        Random rand = new Random(); // new를 사용해서 heap에 올려둠
        num = rand.nextInt(6) + 1;
        
        if(num == 1){
            System.out.println("1이 나왔습니다.");
        } else if(num == 2){
            System.out.println("2가 나왔습니다.");
        } else if(num == 3){
            System.out.println("3이 나왔습니다.");
        } else if(num == 4){
            System.out.println("4가 나왔습니다.");
        } else if(num == 5){
            System.out.println("5가 나왔습니다.");
        } else{
            System.out.println("6이 나왔습니다.");
        }
        // Random은 import를 하는 반면, Math는 import를 하지 않음
        // Java는 java.lang 안에 있는 패키지 값들을 다 가져옴 (enum, integer 등이 다 지정되어있음)
        // Math도 이 java.lang에 들어있는 것
        // => package java.lang 안에 있는 것들은 메모리에 다 올라가 있어서 바로바로 가져다 쓸 수 있음
    }
}
