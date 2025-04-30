package ch12.src.main.java.sec03.exam05;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor  // 기본 생성자
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자
@EqualsAndHashCode
@ToString

public class Member {
    private String id;
    private String name;
    private int age;
}
