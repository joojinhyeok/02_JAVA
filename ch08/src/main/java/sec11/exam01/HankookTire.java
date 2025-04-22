package main.java.sec11.exam01;

public class HankookTire implements Tire{
    @Override
    public Tire roll() {
        System.out.println("한국 타이어가 굴러갑니다.");
        return null;
    }
}
