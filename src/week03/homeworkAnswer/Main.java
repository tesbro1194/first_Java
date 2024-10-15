package week03.homeworkAnswer;

public class Main {
    public static void main(String[] args) {

        Calculator calculator  = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(10, 20));
        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(10,20));



    }
}

// 6번 줄 : 클래스 Calculator 의 객체 calculator 를 생성. 이때 매개변수 AddOperation.
// 이것이 가능한 이유는 AddOperation-자식-이 AbstractOperation-부모-에게 상속받고 있기 때문이다.
// 7번 줄 : calculator.calculate -> AddOperation.operate 이 된 것.
// 8번 줄 : 객체 calculator 를 클래스 Calculator 의 메서드 setOperation 을 통해, 매개변수를 MultiplyOperation 으로 재설정.
// 9번 줄 : calculator.setOperation -> MultiplyOperation.operate 이 된 것.
