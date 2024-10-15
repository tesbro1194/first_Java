package week03.interfaceSample;
// Main은 D를 상속 받고 c와 인터페이스 됨
public class Main extends D implements C {

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }

    @Override
    void d() {
        super.d();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.a();  // extends D 에 의 해 A 출력
        main.b();  // extends D 에 의 해 B 출력
        main.d();  // implements C 에 의해 D 출력
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C extends A, B {
}

class D {
    void d() {
        System.out.println("D");
    }
}
