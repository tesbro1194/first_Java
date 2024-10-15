package week05.thread;

// Thread Class 를 이용하여 쓰레드 생성 및 실행 (상속)
class TestThread extends Thread {
    @Override
    public void run() {  // 쓰레드가 수행하는 작업
        for (int i = 0; i <100; i++) {
            System.out.print("*");
        }
    }
}