package basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExxample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = 0;
        int i = 0;

        do {
            System.out.println("---------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("---------------------");
            System.out.print("선택: ");
            i = sc.nextInt();
            if(i == 1){
                speed += 1;
                System.out.println("현재 속도 = " + speed);
            } else if (i == 2) {
                speed -= 1;
                System.out.println("현재 속도 = " + speed);
            } else{
                System.out.println("프로그램 종료");
            }

        } while(i == 1 || i == 2);



    }
}
