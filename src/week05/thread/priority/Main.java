package week05.thread.priority;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };

        Thread thread1 = new Thread(task1);
        thread1.setPriority(8);
        int threadPriority = thread1.getPriority();
        System.out.println("threadPriority = " + threadPriority);

        Thread thread2 = new Thread(task2);
        thread2.setPriority(2);

        thread1.start();
        thread2.start();
    }
}
// setPriority() 메서드를 통해 우선 순위를 할당함. 우선 순위 1~10, 높을 수록 우선 순위가 높다. 디폴트 5