package main.java.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        // 필드 재할당
        // 객체의 멤버 변수(필드)에 새로운 인스턴스를 대입하는 것
        // 타입은 그대로이고, 인스턴스만 바꾸는 것
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run();
    }
}
