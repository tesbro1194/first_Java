package week05.thread.streamAndLamda.modern;

import java.util.List;

public class Stream03_PipelineExample {
    public static void main(String[] args) {
        List<student> studentList = List.of(
                new student("일지매", 75),
                new student("육지매", 69),
                new student("오지매", 93)
        );

        // 1 : studentList 를 스트림에 넣음. 2 : 인자 arg를 arg.getScore() 로 처리하여 IntStream 으로 변경.
        // 3 : IntStream 의 모든 요소의 평균값을 객체로 받음. 4 : 객체의 속성, 더블값을 얻기 위해 호출.
        double avgScore = studentList.stream()
                .mapToInt((arg) -> arg.getScore())
                .average()
                .getAsDouble();

        System.out.println(avgScore);

        System.out.println();

        // 1 : studentList 를 스트림에 넣음. 2 : 인자 arg를 arg.getName() 로 처리하여 Stream<String> 으로 변경.
        // 3 : forEach()를 통해 스트림의 요소 하나하나 씩 () 안의 로직 수행.
        studentList.stream()
                .map((arg) -> arg.getName())
                .forEach(System.out::println);
    }
}

class student {
    private String name;
    private int score;

    public student (String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}