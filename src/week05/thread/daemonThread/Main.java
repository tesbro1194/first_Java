package week05.thread.daemonThread;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            System.out.println("--------------------------------------");
            for (int i = 0; i < 1000000; i++) {
                System.out.println((i + 1) + "번째 daemon");
            }
        };

        Thread thread = new Thread(demon);
        thread.setDaemon(true); // true 로 설정 시 데몬스레드로 설정됨.
        thread.start();

        // --------------------------------------

        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) + "번째 main");
        }
    }
}

// 우선순위가 낮다 -> 상대적으로 다른 쓰레드에 비해 리소스를 적게 할당 받는다.
// Main 쓰레드가 종료되면 Daemon 쓰레드가 완료되지 않아도 실행이 종료된다.
// JVM 은 사용자 쓰레드의 작업이 끝나면 데몬 쓰레드도 자동으로 종료시켜 버린다.