package basic.ch01.sec11;

public class VariableInitializationExample {
    public static void main(String[] args) {
        // int value; -> 오류. 값을 지정하지 않고 선언만 했기 때문에
        int value = 10;
        int result = value + 10;
        System.out.println(result);
    }
}
