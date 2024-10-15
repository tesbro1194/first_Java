package week05.thread.MakeThreads.single;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("2번" + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        System.out.println("1번" + Thread.currentThread().getName());
        Thread thread1 = new Thread(task);
        thread1.setName("thread1");

        thread1.start();
    }
}
//현재 운영 중인 쓰레드 이름 확인 Thread.currentThread().getName()