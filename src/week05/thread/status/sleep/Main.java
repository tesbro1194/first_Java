package week05.thread.status.sleep;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                // 예외 처리 필수
                // interrupted()를 만나면 실행 대기 상태로 돌아감. InterruptedException 이 발생할 수 있다.
                // 즉 sleep `실행`이 깨짐.
                Thread.sleep(2000);  // sleep: TIMED_WAITING (실행 - > 주어진 시간 동안 기다리는 일시정시) 특정 쓰레드를 sleep하게 하는 것이 아니라, Thread 자체를 sleep 함.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sleep(2000) : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "ThreadTest"); // new로 생성
        thread.start(); // new -> runnable . 실행 대기 상태, 다른 메서드를 통해 실행됨.

        try {
            thread.sleep(1000);  // thread 가 sleep 메서드에 의해 실행됨. thread.sleep() 는 Thread.sleep 와 같다. sleep 메서드가 static 이기 때문.
            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
