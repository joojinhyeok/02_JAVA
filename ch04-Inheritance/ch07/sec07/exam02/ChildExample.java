package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // 자식타입 객체 생성
        Child child = new Child();
        
        // 부모타입 -> child를 업캐스팅. 자식을 부모타입으로 형변환
        Parent parent = child; // 다형성(부모형태로 틀을 만들고 자식으로 덮어씌운다?)
        parent.method1();   // Parent-method1() 출력
        parent.method2();   // Child-method2() 출력
        // parent.method3();
    }
}
