package week04.homework2;

import week04.homework.AddOperation;
import week04.homework.DivideOperation;
import week04.homework.MultiplyOperation;
import week04.homework.SubstractOperation;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        if (Pattern.matches(NUMBER_REG, firstInput)){
            calculator.setFirstNumber(Integer.getInteger(firstInput));
        } else {
            throw new BadInputException("숫자");
        } return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {
        if (Pattern.matches(NUMBER_REG, secondInput)){
            calculator.setFirstNumber(Integer.getInteger(secondInput));
        } else {
            throw new BadInputException("숫자");
        } return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        if (Pattern.matches(OPERATION_REG, operationInput)){
            Calculator calculator1 = new Calculator(new week04.homework2.AddOperation());
            switch (operationInput) {
                case "+" : calculator1.setOperation(new week04.homework2.AddOperation());
                case "-" : calculator1.setOperation(new week04.homework2.SubstractOperation());
                case "*" : calculator1.setOperation(new week04.homework2.MultiplyOperation());
                case "/" : calculator1.setOperation(new week04.homework2.DivideOperation());
        }
    } else {
            throw new BadInputException("연산 기호");
    } return this;
}

    public double executeCalculator() {
        return calculator.calculate();
    }
}