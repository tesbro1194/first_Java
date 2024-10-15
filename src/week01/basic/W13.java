package week02.W01;

import java.util.Objects;
import java.util.Scanner;

public class W13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a 입력 : ");
        String aHand = sc.nextLine();

        System.out.println("b 입력 : ");
        String bHand = sc.nextLine();

        if (Objects.equals(aHand, "가위")) {
            if(Objects.equals(bHand, "가위")){
                System.out.println("무승부");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("b 승리");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("a 승리");
            } else {
                System.out.println("'가위', '바위', '보' 중 하나를 입력하세요");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if(Objects.equals(bHand, "가위")){
                System.out.println("a 승리");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("무승부");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("b 승리");
            } else {
                System.out.println("'가위', '바위', '보' 중 하나를 입력하세요");
            }
        } else if (Objects.equals(aHand, "보")){
            if(Objects.equals(bHand, "가위")){
                System.out.println("b 승리");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("a 승리");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("무승부");
            } else {
                System.out.println("'가위', '바위', '보' 중 하나를 입력하세요");
            }
        } else {System.out.println("'가위', '바위', '보' 중 하나를 입력하세요");
        }
    }
}
