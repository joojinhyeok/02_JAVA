package basic.chap16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문이 두 개 이상일 경우
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // sum() 메서드를 호출
        person.action((x, y) -> sum(x, y));


        /*
        * 메서드 참조
        * 함수형 인터페이스를 람다식으로 쓰는게 아닌, 일반 메서드를 참조시켜 선언하는 방법
        * 일반 메서드를 참조하기 위한 조건
        * 각 메소드의 매개변수 타입/갯수/반환형 이 같아야함
        *
        * 클래스이름::메서드이름  -> static일 때 왼쪽의 형태로 사용
        *
        * 참조변수이름::메서드이름  -> instance일 때 왼쪽의 형태로 사용
        *
        * person.action(LambdaExample::sum);
        * */
    }

    public static double sum(double x, double y) {
        return (x+y);
    }
}
