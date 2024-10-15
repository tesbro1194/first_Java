package week04.ExceptionSample01;

public class StudyException {
    public static void main(String[] args) {
        OutClass ourClass = new OutClass();

//        ourClass.thisMethodIsDangerous(); // 위험하다고 알려진 메서드는 호출 불가
//        try ~ catch ~ finally 구문을 통해서 위험하다고 알려진 메서드를 호출할 수 있음.
//        일단 try ~ 예외가 발생하면 catch ~ (예외가 있든 없든) 이 로직은 finally 진행시켜

        try { // 일단 실행
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) { // ()안에 있는 놈이 예외다. 그때 메세지 출력
            System.out.println(e.getMessage());
        } finally { // 무조건 실행됨
            System.out.println("무조건 무조건이야~");
        }
    }
}
