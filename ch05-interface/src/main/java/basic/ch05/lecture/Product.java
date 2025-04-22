package main.java.basic.ch05.lecture;

public class Product implements InterProduct {
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메서드 호출...!");
    }

    @Override
    public void defaultMethod() {
        System.out.println("InterProduct의 defaultMethod 오버라이딩한 메서드 호출...!");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의 abstMethod 호출");
    }
}
