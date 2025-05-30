package main.java.basic.ch05.lecture;

public interface InterProduct {
    /*
    * 인터페이스는 상수 필드만 작성 가능
    * public static final -> 조합을 상수 필드 -> 선언과 동시에 초기화해야함
    *
    * */ 
    
    // public static final int a = 0;

    // 컴파일러가 자동으로 public static final을 앞에 추가해줌
    int MIN_NUM = 10;
    int MAX_NUM = 100;

    // 인터페이스는 생성자를 가질 수 없음
    //      ex. public InterProduct(){}

    // 인터페이스는 구현부가 있는 메서드를 가질 수 없다.
    //      ex. public void nonStaticMethod(){}

    // 추상 메서드만 작성 가능
    public abstract void nonStaticMethod();

    /*
    * 인터페이스 안에 작성한 메서드는 public abstract의 의미를 가진다
    * 인터페이스를 상속받은 클래스는 메서드를 구현할 때 접근제어자를 public으로 해야 구현 가능함
    * */
    void abstMethod();

    // static 메서드는 가질 수 있음
    public static void staticMethod(){
        System.out.println("InterProduct 인터페이스에서 staticMethod 호출됨...");
    }

    // 인터페이스에서 일반 메서드를 만들기 위해서는 default 키워드를 붙여야한다.
    public default void defaultMethod(){
        System.out.println("InterProduct 인터페이스에서 defaultMethod 호출됨...");
    }
}
