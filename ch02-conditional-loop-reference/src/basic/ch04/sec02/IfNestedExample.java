package basic.ch04.sec02;

import java.util.Random;
public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20 + 81);
        System.out.println("점수: " + score);

        String grade;
        if(score >= 81 && score <= 84){
            grade = "B";
            System.out.println("학점: " + grade);
        } else if(score >= 85 && score <= 89){
            grade = "B+";
            System.out.println("학점: " + grade);
        } else if(score >= 90 && score <= 94){
            grade = "A";
            System.out.println("학점: " + grade);
        } else{
            grade = "A+";
            System.out.println("학점: " + grade);
        }
    }
}
