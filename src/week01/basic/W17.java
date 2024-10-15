package week02.W01;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("알고 싶은 구구단의 단수를 입력 : ");
        int number = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " X " + i + " = " + (i * number));
        }
    }
}
