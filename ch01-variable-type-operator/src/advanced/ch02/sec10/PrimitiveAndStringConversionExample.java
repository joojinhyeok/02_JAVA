package advanced.ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        // 형변환: 문자열 -> 기본형
        int value1 = Integer.parseInt("10");    // 문자열 "10"을 정수 10으로
        double value2 = Double.parseDouble("3.14"); // 문자열 "3.14"를 실수 3.14로
        boolean value3 = Boolean.parseBoolean("true");  // 문자열 "true"를 boolean 타입으로 변환

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        // 형변환: 기본형 -> 문자열
        String str1 = String.valueOf(10);   // 숫자 10을 문자열 "10"으로
        String str2 = String.valueOf(3.14); // 실수 3.14를 문자열 "3.14"로
        String str3 = String.valueOf(true); // boolean 값을 문자열 "true"로

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}
