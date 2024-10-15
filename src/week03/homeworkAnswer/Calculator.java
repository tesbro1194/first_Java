package week03.homeworkAnswer;

public class Calculator {

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber) {
        double answer = 0;
        answer = operation.operate(firstNumber, secondNumber);
        return answer;
    }
}

// 필드에서 private 한 추상클래스 AbstractOperation 의 객체 operation 을 선언
// 생성자에서 추상 클래스 AbstractOperation 의 객체 operation 을 매개변수로 지정.
// 메서드 setOperation 과 calculate 를 선언 및 생성, 구현.
// setOperation 은 매개변수 operation 을 재설정 하는 메서드.
// calculate 은 double 타입의 변수 answer 를 선언 및 0 으로 생성. 변수 answer 에 객체 operation 의 메서드 operate 를 실행.
