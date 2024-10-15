package week04.homework;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public Calculator() {
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public int setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
        return firstNumber;
    }

    public int setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
        return secondNumber;
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }

}
