package week04.homework;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;
        // 구현 2
        CalculatorApp calculatorApp = new CalculatorApp();

        try {
            calculatorApp.start();
        }
        catch (BadInputException e) {} catch (Exception e) {
            System.out.println("잘못된 입력입니다");
        } finally {

        }

    }
}
