package main.java.advanced.ch15.sec05.exam03;

/*
* Comparable을 구현해서 Person 객체간의 정렬 기준을 정의
* */

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    * Comparable
    * - 이 객체들 끼리 기본 정렬(순서)을 어떻게 할 것 인지에 결정하는 인터페이스
    *
    * compareTo 메서드
    * - 음수: this.age < o.age -> this 객체가 o 객체보다 앞에 위치
    * - 0:   this.age == o.age -> 순서 변경 없음
    * - 양수: this.gae > o.age -> this 객체가 o 객체보다 뒤에 위치
    *
    * Collections.sort() 등의 정렬 메서드는 이 반환값을 참조해 객체들의 순서를 결정
    * */


    // 이름이 사전순으로 정렬
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
