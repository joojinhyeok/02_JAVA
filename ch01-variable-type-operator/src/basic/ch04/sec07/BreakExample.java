package basic.ch04.sec07;


import org.w3c.dom.ls.LSOutput;

public class BreakExample {
    public static void main(String[] args) {
        int x = 0;
        do {
            x = (int) (Math.random() * 6) + 1;
            System.out.println(x);
        } while (x != 6);
        System.out.println("프로그램 종료");
    } 
}
