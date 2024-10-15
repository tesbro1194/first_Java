package week02.W01.collection;

import java.util.HashMap;
import java.util.Map;

public class col6 {
    public static void main(String[] args) {
        // map : (Key, Value) 쌍으로 이루어진다는 것이 중요. Key값은 unique(중복 x)
        // HashMap , TreeMap 으로 응용해서 사용.
        Map<String, Integer> intMap = new HashMap<>(); // 선언 및 생성

        intMap.put("일", 1); // (Key, Value) 추가
        intMap.put("이", 2);
        intMap.put("삼", 3);
        intMap.put("삼", 4); // 중복 Key
        intMap.put("삼", 5); // 중복 Key

        for (String key : intMap.keySet()) {     // 값 출력. .keySet()을 통해 value를 빼서 key만 출력
            System.out.println(key); // 이\일\삼
        }

        System.out.println("-----------");
        for (Integer value : intMap.values()) {     // 값 출력. .values()을 통해 key를 빼서 value만 출력
            System.out.println(value); // 2\1\5 -> 마지막 중복key의 마지막 value로 덮어씌워져 저장됨
        }
        System.out.println(intMap.get("삼")); // key를 가지고 value 찾기. key값이 문자열 `삼`인 value를 출력
    }
}