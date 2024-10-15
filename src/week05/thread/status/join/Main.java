package week05.thread.status.join;

// join 메서드 : 정해진 시간 동안 지정한 쓰레드가 작업하는 것을 기다림.
// 시간을 지정하지 않는다면 쓰레드의 작업이 끝날 때까지 기다림.
// 아래는 join 메서드를 통해 Main 쓰레드가 thread 의 작업이 끝날 때까지 기다린다는 것을 나타내고 있다.

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(5000); // 5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "ThreadTest");

        thread.start(); //

        long start = System.currentTimeMillis();  // 실행했을 때의 소요 시간을 알기 위해 long 타입의 start 변수 생성 및 할당.

        try {
            thread.join();
// sleep 과 마찬가지로 InterruptedException 에 대한 예외 처리를 해줘야함.
// thread.interrupt(); 가 되었을 때 catch 로 빠지게 됨.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // thread 의 소요시간인 5000ms 동안 main 쓰레드가 기다렸기 때문에 5000이상이 출력됩니다.
        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));

    }
}
