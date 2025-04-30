package main.java.basic.ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        // K: Tv, M : String
        Product<Tv, String> prodcut1 = new Product<>();
        prodcut1.setKind(new Tv());
        prodcut1.setModel("스마트Tv");

        // Getter의 리턴값이 Tv 타입
        Tv tv = prodcut1.getKind();
        String tvModel = prodcut1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUV 자동차");

        Car car = new Car();
        String carModel = product2.getModel();

//        product2 = ;
//        product2.setKind(new Car());
//        product2.setModel("SUV자동차");
//        car = product2.getKind();
//        carModel = product2.getModel();
    }
}
