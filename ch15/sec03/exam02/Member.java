package ch15.sec03.exam02;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;    // 주소 같으면 true
        if(obj == null || getClass() != obj.getClass()) return false;   // 타입 다르면 false
        Member member = (Member) obj;
        return age == member.age && Objects.equals(name, member.name);
    }

    // hashCode 오버라이딩 - Set 내부에서 중복 여부 체크용

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}