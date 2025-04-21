package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();   // "이륙합니다."

        sa.fly();
        /*
        * public void fly(){
        *   System.out.println("일반 비행합니다.");
        * }
        * */
        sa.flyMode = SupersonicAirplane.SUPERSONIC; // 2
        sa.fly();

        sa.flyMode = SupersonicAirplane.NORMAL; // 1
        sa.fly();

        sa.land();
    }
}
