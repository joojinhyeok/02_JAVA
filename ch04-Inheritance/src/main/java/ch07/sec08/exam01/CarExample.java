package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        // 하나의 인스턴스가 여러 타입을 가질 수 있음. tire가 한국/금호/테슬라 다 가능
        
        // Tire 타입의 tire 속성이 정의 되지 않음
        // Tire tire = new Tire();
        // Tire tire = new HankookTire();  // 다형성 - 업캐스팅
        Tire tire = new TeslaTire();
        // Tire tire = new KumhoTire();

        myCar.tire = tire;


        myCar.run();
    }
}
