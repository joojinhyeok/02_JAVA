package ch07.sec10.lecture;

public abstract class Product {
    private int nonStaticField;
    private static int StaticField;

    public Product() {
    }
    
    // 추상메서드
    public abstract void abstMethod();  //{} 부분은 생략
    
    public void nonStaticMethod(){
        System.out.println("추상클래스안의 nonStaticMethod() 호출됨!!");
    }
    public static void staticMethod(){
        System.out.println("추상클래스안의 staticMethod() 호출됨!!");
    }
}
