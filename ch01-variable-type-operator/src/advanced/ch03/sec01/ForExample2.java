package advanced.ch03.sec01;

public class ForExample2 {
    public static void main(String[] args) {
        for(int i = 1; i<6; i++){
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
