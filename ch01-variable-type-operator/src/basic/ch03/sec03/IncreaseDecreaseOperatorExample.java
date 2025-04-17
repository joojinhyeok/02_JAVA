package basic.ch03.sec03;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;    // 11
        ++x;    // 12
        System.out.println("x = " + x);

        System.out.println("-----------------");

        y--; // 9
        --y; // 8
        System.out.println("y = " + y);

        System.out.println("-----------------");

        z = x++; // 12 -> z에 우선 x(=12)를 넣고 x값 1증가
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("-----------------");

        z = ++x;    // 14 -> z에 x(=13) + 1 해준 값을 넣기
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("-----------------");

        z = ++x + y++;  // x(=15) + y(=8) 계산 후 y값 1증가
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
