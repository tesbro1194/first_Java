package week04.ExceptionSample01;

public class OutClass {
    private final boolean just = true;

    // throws : 던지다 ( 예외를 던지다, 발생시키다)
    public void thisMethodIsDangerous() throws OurBadException {   // throws OurBadException 을 통해 이 메서드에 예외가 있을 수 있음을 알리기.
        System.out.println("예외 발생");
        if (just) {
            throw new OurBadException(); //
        }
    }
}
