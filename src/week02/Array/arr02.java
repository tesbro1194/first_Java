package week02.W01.Array;

import java.util.Arrays;

public class arr02 {
    public static void main(String[] args) {
        // 초기화 1) 배열에 특정값 지정하며 선언
        int[] intArr = {10, 20, 30, 40, 50};
        String[] stringArr = {"a", "b", "c", "d", "e"};
        //초기화 2) for문을 통해 특정값을 지정하며 선언
        for(int i=0; i<intArr.length; i++){
            intArr[i] = i;
        }
        //다건 출력, index 0번부터 배열의 길이까지 모두 출력.
        for(int i=0; i<intArr.length; i++){
            System.out.println(intArr[i]);
        }
        //향상된 for문을 통한 intArr 지정
        System.out.println("--------------------");
        for(int item : intArr){
            System.out.println(item);
        }
        // 배열의 주소를 모두 같은 값으로 초기화
        System.out.println("--------------------");
        Arrays.fill(intArr, 3);
        for(int i=0; i<intArr.length; i++){
            System.out.println(intArr[i]);
        }
    }
}
