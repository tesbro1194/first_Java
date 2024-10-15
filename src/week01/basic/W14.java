package week02.W14;

import java.util.Scanner;

public class W14 {
    public static void main(String[] args) {

        System.out.println("자연수 입력 : ");
        Scanner sc = new Scanner(System.in);
        int naturalNumber = sc.nextInt();

        int odd_even_number = naturalNumber%2;
        System.out.println(odd_even_number);

        switch (odd_even_number) {
            case 0:
                System.out.println("짝수입니다");
                break;
            case 1:
                System.out.println("홀수입니다");
                break;
        }
    }
}