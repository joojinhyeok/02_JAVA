package main.java.sec10.exam02;

public class Bus implements Vehicle{
    // 인터페이스 오버라이딩
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    // 새로운 매서드 정의
    public void checkFare(){
        System.out.println("승차요금을 체크합니다.");
    }
}
