package week05.thread.group;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + " Interrupted");
        };

        // ThreadGroup 클래스로 객체를 만듭니다.
        ThreadGroup group1 = new ThreadGroup("Group1");

        // Thread 객체 생성시 첫번째 매개변수로 넣어줍니다.
        // Thread(ThreadGroup group, Runnable target, String name) , 생성자가 여러 개 있기 떄문에 이러한 방식으로 구현 가능
        Thread thread1 = new Thread(group1, task, "Thread 1");
        Thread thread2 = new Thread(group1, task, "Thread 2");

        // Thread에 ThreadGroup 이 할당된것을 확인할 수 있습니다.
        System.out.println("Group of thread1 : " + thread1.getThreadGroup().getName());
        System.out.println("Group of thread2 : " + thread2.getThreadGroup().getName());

        thread1.start();
        thread2.start();

        try {
            // 현재 쓰레드를 지정된 시간동안 멈추게 합니다. 아래는 5초 동안
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // interrupt()는 일시정지 상태인 쓰레드를 실행대기 상태로 만듭니다.
        // thread1, thread2 를 그룹으로 묶었기 때문에 그룹 아래 있는 쓰레드들에 일괄적으로 메서드 호출 가능.
        group1.interrupt();

    }
}

// JVM이 실행되면 시스템 그룹이 생성되고 쓰레드들은 system 그룹에 포함된다. system 그룹 하위에 main 그룹이 포함된다.
// 모든 쓰레드들은 하나의 그룹에 포함되어 있어야 한다.
