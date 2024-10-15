package week02.W01.Array;

public class arr01 {
    public static void main(String[] args) {
        // 배열 생성
        int[] intArray = new int[3]; //{0, 0, 0}
        boolean[] booArray = new boolean[3]; // {false, false, false}
        String[] stringArray = new String[3]; //{"", "", ""}

        // 배열 선언 -> 초기화
        int[] intArr;
        intArr = new int[3]; // {0, 0, 0}

        // 배열을 `순회` -> 배열의 값을 하나씩 뽑아서 조회한다.
        // 1) 단건 조회
        System.out.println(intArray[1]); // intArray의 두 번째 값을 조회.
        System.out.println("------------");
        // 2) *** 다건 조회 ***
        for(int i=0; i<intArray.length; i++){                          // intArray의 length는 3
            System.out.println(intArray[i]);
        }
    }
}
