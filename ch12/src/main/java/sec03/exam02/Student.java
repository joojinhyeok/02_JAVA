package sec03.exam02;


public class Student {
    private int no;
    private String name;

    public Student(int no) {
        this.no = no;
    }
    public Student(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
