package week05.thread.MakeThreads.multi;

public class Main {
    public static void main(String[] args) {
        // 1st Thread
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };
        // 2nd Thread
        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };


        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task2);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}

// 순서가 보장되어 있지 않음. 걸리는 시간이나 동작을 예측할 수 없다.
// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$***********************************$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*****************************************************************
// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$****************************************************************************************************$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$