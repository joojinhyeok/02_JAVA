package basic.ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = 9;   // 10, 11인 경우
        System.out.println("[현재시간: " + time + "시]");

        switch(time){   // time = 9
            case 8:
                System.out.println("출근합니다.");
            case 9: // 여기서 조건이 걸리지만 break문이 없기 때문에 switch문을 빠져 나가지 못하고 계속 실행
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
