package week03.homework;

import java.util.Scanner;

public class Lv2 {
    public static void main(String[] args) {
        double number=0;

        System.out.println("첫 번째 숫자를 입력하세요: ");
        Scanner number1 = new Scanner(System.in);
        double firNumber = number1.nextInt();

        System.out.println("사칙연산 기호를 입력하세요: ");
        Scanner operator = new Scanner(System.in);
        String getOperator = operator.next();

        System.out.println("두 번째 숫자를 입력하세요: ");
        Scanner number2 = new Scanner(System.in);
        double secNumber = number2.nextInt();

        Calculator calculator = new Calculator();

        if (getOperator.equals("+")){
            number = calculator.addCalculate(firNumber, secNumber);
            System.out.println(number);
        }

        else if (getOperator.equals("-")){
            number = calculator.substractCalculate(firNumber, secNumber);
            System.out.println(number);
        }

        else if (getOperator.equals("*")){
            number = calculator.multiplyCalculate(firNumber, secNumber);
            System.out.println(number);
        }

        else if (getOperator.equals("/")){
            number = calculator.divideCalculate(firNumber, secNumber);
            System.out.println(number);
        }

        else if (getOperator.equals("%")){
            number = firNumber%secNumber;
            System.out.println(number);

        } else {
            System.out.println("연산 기호를 확인하시오");
        }
    }
}
