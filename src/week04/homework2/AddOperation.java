package week04.homework2;

public class AddOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}

// 추상 클래스 AbstractOperation 에 상속 받고 있는 자식 클래스 :
// AddOperation, SubstractOperation, MultiplyOperation, DivideOperation.
// 추상 메서드를 override 하고 있으며 구현 부분이 명시되어 있음.