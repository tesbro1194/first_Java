import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            int starter = commands[i][0] - 1;  // 1-based to 0-based
            int ender = commands[i][1] - 1;    // end index is also 1-based
            int cutter = commands[i][2] - 1;   // k번째 요소는 0-based

            ArrayList<Integer> arrayList = new ArrayList<>();

            // 범위에 맞게 배열을 복사
            for (int j = starter; j <= ender; j++) {
                arrayList.add(array[j]);
            }

            // 복사한 배열을 정렬
            Collections.sort(arrayList);

            // k번째 값을 정렬된 배열에서 추출하여 추가
            answerList.add(arrayList.get(cutter));
        }

        // ArrayList를 int[]로 변환
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}

