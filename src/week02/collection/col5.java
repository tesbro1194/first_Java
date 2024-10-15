package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class col5 {
    public static void main(String[] args) {
        // Set은 집합. 순서 없고 중복 없음.
        // 생성자가 없는 껍데기라서 바로 생성할 수 없음. HashSet, TreeSet로 생성.
        Set<Integer> intSet = new HashSet<Integer>(); // 선언 및 생성

        intSet.add(3);
        intSet.add(6);
        intSet.add(9);
        intSet.add(2);
        intSet.add(5);
        intSet.add(3);
        intSet.add(6);
        intSet.add(9);

        for(Integer value: intSet){
            System.out.println(value);  // 중복 없음.
        }
        System.out.println(intSet.contains(5)); // intSet은 5를 포함하고 있니? true
        System.out.println(intSet.contains(7)); // intSet은 7을 포함하고 있니? false
    }
}
