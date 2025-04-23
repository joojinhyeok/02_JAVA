package main.java.sec02.exam01;

public class ExceptionHandlingExample {
    public static void printLength(String data) {

        int result = data.length();
        System.out.println("문자 수: " + result);

    }
    public static void main(String[] args) {

        try {
            System.out.println("[프로그램 시작]\n");
            printLength("ThisIsJava");
            printLength(null);
        } catch (NullPointerException e){
            System.out.println("에러 발생");
            System.out.println(e.getMessage()); // 예외 객체의 메시지로 출력
            e.printStackTrace();    // 스택 추적 내용을 모두 출력
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            System.out.println("[프로그램 종료]");
        }
    }
}
