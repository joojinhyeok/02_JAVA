package main.java.advanced.ch15.sec05.exam04;

import java.util.Comparator;

public class FruitCompartor implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        // o1이 o2보다 뒤에 오게함
        return Integer.compare(o1.getPrice(), o2.getPrice());  // o1이 o2보다 앞에 오게함
    }
}
