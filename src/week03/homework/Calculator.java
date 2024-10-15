package week03.homework;

public class Calculator {
    double number;


    AddOperation addC = new AddOperation();
    SubstractOperation substractC = new SubstractOperation();
    MultiplyOperation multiplyC = new MultiplyOperation();
    DivideOperation divideC = new DivideOperation();

    public Calculator(){};

    public double addCalculate (double firstNumber, double secondNumber) {
        number = addC.abstractOperate(firstNumber, secondNumber);
        return number;
    }

    public double substractCalculate (double firstNumber, double secondNumber) {
        number = substractC.abstractOperate(firstNumber, secondNumber);
        return number;
    }
    public double multiplyCalculate (double firstNumber, double secondNumber) {
        number = multiplyC.abstractOperate(firstNumber, secondNumber);
        return number;
    }
    public double divideCalculate (double firstNumber, double secondNumber) {
        number = divideC.abstractOperate(firstNumber, secondNumber);
        return number;
    }
}
