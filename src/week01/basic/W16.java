package week02.W01;

public class W16 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) { // 가장 바깥 반복문
            System.out.println("i : " + i);
            if(i==2){
                break;  // i가 2일 때, 가장 바깥 반복문 종료
            }
            for (int j=0; j<10; j++){  // 가장 안쪽 반복문
                System.out.println("j : " + j);
                if (j == 2){
                    break;  // j가 2일 때, 가장 안쪽 반복문 종료
                }
            }
        }
    }
}
