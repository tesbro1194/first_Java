package week05.thread.streamAndLamda.modern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream02_Parallel {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("일지매");
        list.add("김반장");
        list.add("아주머니");
        list.add("할배");

        // 멀티 스트림을 만들어 병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach((item) -> {
            System.out.println("item: " + item + " - 쓰레드: " + Thread.currentThread().getName());
        });  // Thread.currentThread().getName() : 현재 쓰레드의 이름

        // 컬렉션에 포함된 요소의 갯수가 많을 수록 병렬 쓰레드 처리 하는 것이 빠르다.
    }
}
