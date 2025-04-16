package main.java.practice.ch06.sec07.exam05;

public class CarExample {
    public static void main(String[] args) {
    Car myCar1 = new Car();
    Car myCar2 = new Car("자가용");
    Car myCar3 = new Car("자가용", "빨강");
    Car myCar4 = new Car("택시", "검정", 200);

    System.out.println("myCar1.company : " + myCar1.company);
    System.out.println("myCar2.company : " + myCar2.company);
    System.out.println("myCar2.model : " + myCar2.model);
    System.out.println("myCar3.company : " + myCar3.company);
    System.out.println("myCar3.model : " + myCar3.model);
    System.out.println("myCar3.color : " + myCar3.color);
    System.out.println("myCar4.company : " + myCar4.company);
    System.out.println("myCar4.model : " + myCar4.model);
    System.out.println("myCar4.color : " + myCar4.color);
    System.out.println("myCar4.maxSpeed : " + myCar4.maxSpeed);
    }

}
