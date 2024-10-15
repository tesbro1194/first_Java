package week02.W01.collection;

import java.util.LinkedList;
import java.util.Queue;

public class col4 {
    public static void main(String[] args) {
        // Queue : 생성자가 없는 인터페이스
        Queue<Integer> intQueue = new LinkedList<Integer>(); // 생성 및 선언
        intQueue.add(8);
        intQueue.add(4);
        intQueue.add(9);

        while(!intQueue.isEmpty()){
            System.out.println(intQueue.poll()); // 8\4\9 처음 넣은 값이 먼저 출력됨
        }
        intQueue.add(8);
        intQueue.add(4);
        intQueue.add(9);
        System.out.println(intQueue.peek()); // 8
        System.out.println(intQueue.size()); // 3
    }
}
