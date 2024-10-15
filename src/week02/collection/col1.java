package week02.W01.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class col1 {
    public static void main(String[] args) {
        // 1. ArrayList : 생성 시점에 작은 연속된 공감을 요청해서 참조형 변수를 담는다. 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장한다.
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 및 생성
        intList.add(11); // intList에 11을 추가
        intList.add(22); // intList에 22을 추가
        intList.add(33); // intList에 33을 추가

        System.out.println(intList.get(0)); // 11 출력 메서드(명령어)
        System.out.println(intList.get(1)); // 22
        System.out.println(intList.get(2)); // 33

        intList.set(1, 5); // 1번째 값을 5로 수정한다
        System.out.println(intList.get(1)); // 5

        intList.remove(0); // 0번째 값을 삭제한다
        System.out.println(intList.get(0)); // 0번째 값이 사라지고 1번째 값이 0번째 값이 되어 5
        System.out.println(intList.toString());  // [15, 3]
        intList.clear(); // 전체 삭제
        System.out.println(intList.toString());  // []

        // 2. LinkedList : 남는 메모리 공간 여기 저기에 나누어서 실제 값을 담는다. 즉 실제 값이 있는 주소값으로 목록을 구성하고 저장한다. 조회 속도가 느린 반면, 추가나 삭제할 때 빠르다.
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(11); // 추가
        linkedList.add(22);
        linkedList.add(33);

        System.out.println(linkedList.get(0)); // 11
        System.out.println(linkedList.get(1)); // 22
        System.out.println(linkedList.get(2)); // 33
        System.out.println(linkedList.toString()); // [11, 22, 33]

        linkedList.add(2, 9); // 2번 쨰에 9를 추가
        System.out.println(linkedList.toString()); // [11, 22, 9, 33]

        linkedList.set(1, 5); // 1번째 값을 5로 수정
        System.out.println(linkedList.toString()); // [11, 5, 9, 33]

        linkedList.remove(1); // 1번째 값을 삭제
        System.out.println(linkedList.toString()); // [11, 9, 33]

        linkedList.clear();
        System.out.println(linkedList.toString()); // []
    }
}
