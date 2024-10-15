package week04.ExceptionSample01;

// 예외 클래스를 만들어서 예외를 정의 !! 자식클래스 extends 부모클래스
public class OurBadException extends Exception {
    OurBadException () {
        super("위험한 행동에는 예외 처리가 필요함");
    }
}
