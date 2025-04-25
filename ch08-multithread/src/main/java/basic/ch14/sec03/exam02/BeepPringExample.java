package basic.ch14.sec03.exam02;

public class BeepPringExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableClass());
        // start()를 호출하면 run()안에 있는 작업을 별도 스레드에서 실행
        // thread.run()으로 실행하면 그냥 일반 함수처럼 실행
        // 무조건 start()로 해야 새 스레드 생성
        thread.start(); 

        for(int i = 0; i<5; i++){
            // "띵" 5번 출력
            System.out.println("띵");
        } try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
