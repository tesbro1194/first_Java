package week03.instanceofSample;

// 다형성

class Parent { }
class Child extends Parent { }
class Brother extends Parent { }


public class Main {
    public static void main(String[] args) {

        Parent pc = new Child();  // 다형성 허용 (자식 -> 부모)

        Parent p = new Parent();

        System.out.println(p instanceof Object); // p는 Object의 인스턴스니 ? true
        System.out.println(p instanceof Parent); // p는 Parent의 인스턴스니 ? true
        System.out.println(p instanceof Child);  // p는 Child의 인스턴스가 맞니? false

        Parent c = new Child();

        System.out.println(c instanceof Object); // c는 Object의 인스턴스니 ? true 출력
        System.out.println(c instanceof Parent); // c는 Parent의 인스턴스니 ? true 출력
        System.out.println(c instanceof Child);  // c는 Child의 인스턴스가 맞니? true 출력

    }
}
