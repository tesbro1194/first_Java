package week05.thread.status.yield;

// yield 를 사용하면 남은 시간을 다음 쓰레드에게 양보하고 자신은 실행 대기 상태가 됨.

// thread1과 thread2 는 같이 1초에 한 번씩 출력되다가
// 5초 후 thread1에서 예외가 발생하면서 Thread.yield()가 실행됨.
// thread1는 실행 대기 상태가 되고, 남은 시간을 thread2에게 양보함.
public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                Thread.yield();
            }
        };

        Thread thread1 = new Thread(task, "thread1");
        Thread thread2 = new Thread(task, "thread2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();

    }
}