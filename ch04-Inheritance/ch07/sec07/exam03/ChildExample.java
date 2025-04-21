package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {

        // Parent틀에 Child를 덮어씌웠으므로 Child에서 새롭게 정의한 필드와 메서드는 사용 불가능
        Parent parent = new Child();

        parent.field1 = "data1";


        parent.method1();
        parent.method2();

        // parent.field2 = "data2"; -> Child에서 새롭게 정의
        // parent.method3(); -> Child에서 새롭게 정의

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}
