package week05.thread.streamAndLamda.modern;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("일지매");
        set.add("바보온달");

        // 외부 반복자 이용
        for (String item : set) {
            System.out.println(item);
        }
        System.out.println();

        // 내부 반복자, 스트림 이용
        // set 을 스트림으로 만든다. 그때 요소는 <> 안의 String 타입 객체다.
        Stream<String> stream =set.stream();
        // stream.forEach(() -> {});  스트림을 통해 흐르는 각 요소(객체)에 대해 안의 람다식으로 처리해라.
        stream.forEach((t) -> {
            System.out.println(t);
        });

        /* 위는 아래와 같음.
        stream.forEach((t) -> System.out.println(t));
        stream.forEach(System.out::println);
        * */


    }
}
