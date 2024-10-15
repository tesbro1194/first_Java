package week05.thread;

public class Main {
    public static void main(String[] args) {
        TestThread thread = new TestThread();  // 쓰레드 생성
        thread.start();  // thread 실행

        // ------------------------

        Runnable run = new TestRunnable();  // Runnable implements 구현한 TestRunnable 클래스 이용
        Thread thread2 = new Thread(run);  // 쓰레드 생성

        thread2.start();  // thread2 실행

        // ------------------------
        // 19~26번 줄 : 람다 사용. 구현 부분을 {} 에 적고 task 에 담는다.
        // 이후 28번 30번 줄에서 쓰레드를 만들 때 사용한다.

        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };

        Thread thread3 = new Thread(task);
        thread3.setName("thread3");
        Thread thread4 = new Thread(task);
        thread4.setName("thread4");

        thread3.start();
        thread4.start();

    }
}
