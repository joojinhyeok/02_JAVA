package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    public int flyMode = NORMAL;
    
    @Override
    public void fly() { // fly() 재정의
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            // 부모한테 있는 fly()를 호출
            super.fly();
        }
    }
}
