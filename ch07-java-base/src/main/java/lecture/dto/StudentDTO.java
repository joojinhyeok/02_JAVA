//package lecture.dto;
//
//import lombok.*;
//
//// DTO(= Data Transfer Object)
//// --> 데이터 전달용 객체
//
//@NoArgsConstructor  // 매개변수 없는 생성자
//@AllArgsConstructor // 모든 필드를 매개변수로 받는 생성자
//@RequiredArgsConstructor // -> final, notnull 이 붙은 필드가 있으면 이 필드만 초기화시키는 생성자
//// @ToString   // 오버라이딩
//@Getter
//@Setter
//// @Data   // -> @RequiredAragsConstructor, @Getter, @Setter, @toString...다 합친것. 잘 사용하지 않음
//
//public class StudentDTO {
//
//    // @NonNull
//    private String name;
//    private int age;
//    private String email;
//}
