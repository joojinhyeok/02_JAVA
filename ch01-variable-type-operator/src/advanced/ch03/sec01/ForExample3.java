package advanced.ch03.sec01;

public class ForExample3 {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            for(int j = 6-i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
