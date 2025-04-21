package ch07.sec07.exam02;

public class Child extends Parent{

    // Parent 상속 받음
    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }
    public void method3() {
        System.out.println("Child-method3()");
    }
}
