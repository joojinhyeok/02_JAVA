package basic.ch06.sec08.lecture.problem;

public class Application {
    
    // 드라큘라(200), 프랑켄슈타인(300), 미이라(400)
    public static void main(String[] args) {
        Monster m1 = new Monster();
        m1.setName("드라큘라");
        m1.setHp(200);

        Monster m2 = new Monster();
        m2.setName("프랑켄슈타인");
        m2.setHp(300);

        Monster m3 = new Monster();
        m3.setName("미이라");
        m3.setHp(400);



        System.out.println("m1.name = " + m1.getName());
        System.out.println("m1.hp = " + m1.getHp());

        System.out.println("m2.name = " + m2.getName());
        System.out.println("m2.hp = " + m2.getHp());

        System.out.println("m3.name = " + m3.getName());
        System.out.println("m3.hp = " + m3.getHp());
    }
}
