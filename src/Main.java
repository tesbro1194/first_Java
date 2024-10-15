public class Main {
    public static void main(String[] args) {

    }
}


//class Solution {
//    public static int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//
//        for (int i = 0; i < answer.length; i++) {
//            // commands 의 숫자를 활용하기 위해 인덱스에 맞춰서 수정
//            int first = commands[i][0] - 1;
//            int second = commands[i][1];
//            int third = commands[i][2] - 1;
//
//            // 자른 숫자를 넣을 동적 배열.
//            ArrayList<Integer> commandsList = new ArrayList<>();
//
//            // 위에서 정렬한 수정한 숫자에 맞게 로직 수행.
//            // first 부터 second 까지 commandsList 에 넣음.
//            for (int j=first; j<second; j++) {
//                commandsList.add(array[j]);
//            }
//            // commandsList 정렬
//            Collections.sort(commandsList);
//            // answer[] 에 추가.
//            answer[i] = commandsList.get(third);
//        }
//        return answer;
//    }
//}


// 변수 이름 한 번에 바꾸는 단축키 shift + f6

// `메서드 시그니처` 로 검색해서 추가 학습.
