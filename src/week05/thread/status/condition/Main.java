package week05.thread.status.condition;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// condition :  wait()과 notify()는 waiting pool 내에 대기 중인 스레드를 구분하지 못하므로, 특정 조건을 만족하는 스레드만 깨우기가 어렵다.
// 이러한 문제를 해결하기 위해 java 에서 condition 인터페이스를 제공.
// Condition 은 waiting pool 내의 스레드를 분리하여 특정 조건이 만족될 때만 깨우도록 할 수 있으며, ReentrantLock 클래스와 함께 사용된다.
// wait()과 notify() 대신 Condition 의 await() & signal() 을 사용

public class Main {
    public static final int MAX_TASK = 5;
    private ReentrantLock lock = new ReentrantLock();

    // lock으로 condition 생성
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    private ArrayList<String> tasks = new ArrayList<>();

    // 작업 메서드
    public void addMethod(String task) {
        lock.lock(); // 임계영역 시작

        try {
            while(tasks.size() >= MAX_TASK) {
                String name = Thread.currentThread().getName();
                System.out.println(name+" is waiting.");
                try {
                    condition1.await(); // wait(); condition1 쓰레드를 기다리게 합니다.
                    Thread.sleep(500);
                } catch(InterruptedException e) {}
            }

            tasks.add(task);
            condition2.signal(); // notify();  기다리고 있는 condition2를 깨워줍니다.
            System.out.println("Tasks:" + tasks.toString());
        } finally {
            lock.unlock(); // 임계영역 끝
        }
    }
}
