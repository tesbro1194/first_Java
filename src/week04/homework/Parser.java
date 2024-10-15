package week04.homework;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private static final Calculator calculator = new Calculator();

    public static int parseFirstNum(String firstInput) {
        return calculator.setFirstNumber(Integer.getInteger(firstInput));
    }

    public static int parseSecondNum(String secondInput) {
        return calculator.setSecondNumber(Integer.getInteger(secondInput));
    }

    public String parseOperator(String operationInput) {
        Calculator calculator1 = new Calculator(new AddOperation());
        switch (operationInput) {
            case "더하기" : calculator1.setOperation(new AddOperation());
            case "빼기" : calculator1.setOperation(new SubstractOperation());
            case "곱하기" : calculator1.setOperation(new MultiplyOperation());
            case "나누기" : calculator1.setOperation(new DivideOperation());
        }

        return String.format(operationInput);
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
