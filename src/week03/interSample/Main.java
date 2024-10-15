package week03.interSample;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        A a1 = new B();  // 자동 형변환
        a1.a();
        // a1.b(); // 불가능 , a1은 A타입이기 떄문에 a()메서드만 가지고 있음

        System.out.println("\nB 강제 타입변환");
        B b = (B) a1;  // a1의 타입`A`를 B로 변환
        b.a();
        b.b(); // 강제 타입변환으로 사용 가능
        System.out.println();

        // A 인터페이스에 구현체 B를 상속받은 C 대입
        A a2 = new C();
        a2.a();
        //a2.b(); // 불가능 , 클래스 C가 메서드 a(), b(), c() 전부 가지고 있다고 하더라도
        //a2.c(); // 불가능 , a2은 A타입이기 떄문에 a()메서드만 가지고 있음

        System.out.println("\nC 강제 타입변환");
        C c = (C) a2;  // a2의 타입`A`를 C로 변환
        c.a();
        c.b(); // 강제 타입변환으로 사용 가능
        c.c(); // 강제 타입변환으로 사용 가능


    }
}

interface A {
    void a();
}

class B implements A {
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}

class C extends B {
    public void c() {
        System.out.println("C.c()");
    }
}
