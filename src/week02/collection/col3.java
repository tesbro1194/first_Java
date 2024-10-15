package week02.W01.collection;

import java.util.Stack;

public class col3 {
    public static void main(String[] args) {
        // Stack : 최근 저장된 데이터를 나열하거나 데이터의 중복 처리를 막고 싶을 때 사용
        Stack<Integer> intStack = new Stack<Integer>(); // 생성 및 선언

        intStack.push(10); // intStack에 10을 넣다
        intStack.push(25); // intStack에 25을 넣다
        intStack.push(3); // intStack에 3을 넣다

        while (!intStack.isEmpty()){ // 다 비워질 때까지 출력
            System.out.println(intStack.pop()); // 3\25\10
        }
        intStack.push(10);
        intStack.push(25);
        intStack.push(60);
        intStack.push(7);

        System.out.println(intStack.peek()); // 7, 맨 위에 쌓인 값을 출력
        System.out.println(intStack.size()); // 4
    }
}
