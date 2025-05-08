package main.java.advanced.ch15.sec05.exercise;

public class ApplicationExample implements Comparable<Student>{

    public int num;
    public String name;
    public String email;
    public String git;

    public ApplicationExample(int num, String name, String email, String git) {
        this.num = num;
        this.name = name;
        this.email = email;
        this.git = git;
    }

    @Override
    public int compareTo(Student o) {
        return this.num.compareTo(o.num);
    }
}
