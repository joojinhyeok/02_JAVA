package basic.ch14.sec03.exam02;

import java.awt.*;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        // 스레드한테 시킬 일
        // Toolkit 도구모움 클래스
        // beep
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i = 0; i<5; i++){
            toolkit.beep(); // 호출하면 삐- 하고 소리남
            try {Thread.sleep(500); // 0.5초 동안 해당 스레드 멈춤
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
