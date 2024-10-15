package week05.thread.status.interrupt;

// 1. 예외 상황 발생

//public class Main {
//    public static void main(String[] args) {
//        Runnable task = () -> {  //  아래는 Runnable 의 구현체
//            try {
//                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName()); // 실행 안됨
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("task : " + Thread.currentThread().getName());
//        };
//
//        Thread thread = new Thread(task, "ThreadTest");  // New
//        thread.start();  // Runnable
//
//        thread.interrupt();  // interrupt()를 발생시켜 catch로 빠지게 됨
//
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//
//    }
//}


// 2. 예외 상황 발생 X


public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {  // interrupted 상태를 체크해서 아닐 때만 실행되게 함 결국 try  catch 전부 실행 안됨.
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "ThreadTest");
        thread.start();

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}