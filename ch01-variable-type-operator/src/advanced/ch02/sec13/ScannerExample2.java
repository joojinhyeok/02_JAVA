package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("입력 문자열: ");
            String str = sc.nextLine();
            System.out.println("출력 문자열: " + str);
            System.out.println();

            // ''(=문자형 char) 과 ""(=문자열 String) 를 확실하게 구분해야함.
            if(str.equals("q")){
                System.out.print("종료");
                break;
            }
        }
    }
}
