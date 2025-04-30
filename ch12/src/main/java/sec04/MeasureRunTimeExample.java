//package ch12.src.main.java.sec04;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString
//public class MeasureRunTimeExample {
//    private long sum;
//    private long durationNano;
//
//    public void calculateSumAndMeasureTime(int max) {
//        long startTime = System.nanoTime();
//        this.sum = 0;
//        for (int i = 1; i <= max; i++) {
//            this.sum += i;
//        }
//        long endTime = System.nanoTime();
//        this.durationNano = endTime - startTime;
//    }
//
//    public static void main(String[] args) {
//        MeasureRunTimeExample example = new MeasureRunTimeExample();
//        int max = 10_000_000;
//        example.calculateSumAndMeasureTime(max);
//        System.out.println("1부터 " + max + "까지의 합: " + example.getSum());
//        System.out.println("실행 시간: " + example.getDurationNano() + " 나노초");
//    }
//}