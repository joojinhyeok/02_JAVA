package main.java.sec11.exam01;

public class KumhoTire implements Tire{
    @Override
    public Tire roll() {
        System.out.println("금호 타이어가 굴러갑니다.");
        return null;
    }
}
