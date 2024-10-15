package week05.thread;

// 2. Runnable implements 구현
class TestRunnable implements Runnable {
    @Override
    public void run() {  // 쓰레드 수행 작업
        for (int i = 0; i <100; i++) {
            System.out.print("$");
        }
    }
}
