package basic.ch17.sec10;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        //2의 배수 카운팅
        long count = Arrays.stream(arr)
                .filter(i -> i%2 == 0)
                .count();

        System.out.println("2의 배수 개수: " + count);

        //2의 배수 총합
        long count2 = Arrays.stream(arr)
                .filter(i -> i%2 == 0)
                .sum();

        System.out.println("2의 배수의 합: " + count2);

        //2의 배수 평균
        OptionalDouble count3 = Arrays.stream(arr)
                .filter(i -> i%2 == 0)
                .average();

        System.out.println("2의 배수의 평균: " + count3.getAsDouble());

        //2의 배수 중 최대값
        OptionalInt count4 = Arrays.stream(arr)
                .filter(i -> i%2 == 0)
                .max();

        System.out.println("최대값: " + count4.getAsInt());

        // 2의 배수 중 최소값
        OptionalInt count5 = Arrays.stream(arr)
                .filter(i -> i%2 == 0)
                .min();

        System.out.println("최소값: " + count5.getAsInt());

        //첫 번째 3의 배수
        OptionalInt count6 = Arrays.stream(arr)
                .filter(i -> i%3 == 0)
                .findFirst();

        System.out.println("첫 번째 3의 배수: " + count6.getAsInt());
    }
}
