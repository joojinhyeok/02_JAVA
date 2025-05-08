package advanced.ch17.sec06.exam02;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        // 스트림 처리
        Arrays.stream(intArray)
                .boxed()
                .map(i -> i.doubleValue())
                .forEach(d -> System.out.println(d));

        System.out.println();

        Arrays.stream(intArray)
                .forEach(i -> System.out.println(i));
    }
}