package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        Computer myComputer = new Computer();

        System.out.println("areaCircle()" + myCalculator.areaCircle(3));
        System.out.println("areaCircle()" + myComputer.areaCircle(3));
    }
}
