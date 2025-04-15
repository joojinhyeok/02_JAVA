package basic.ch03.sec03;

public class AccuracyExample1 {
    public static void main(String[] args) {
//        int apple = 1;
//        double pieceUnit = 0.1;
//        int number = 7;
//
//        double result = apple -number*pieceUnit;
//        System.out.println("result: " + result);
        // 0.2999999993 으로 출력 -> 컴퓨터는 소수를 2진수로 완벽하게 표현이 불가능하기 때문에 근사값을 이용
        int apple = 10;
        double pieceUnit = 1;
        int number = 7;

        double result = apple -number*pieceUnit;
        System.out.println("result: " + result/10);
    }
}
