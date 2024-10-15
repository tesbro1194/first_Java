public class W07 {
    public static void main(String[] args) {
        // 1) 형변환 연산자
        int intNumber = 2 + (int)3.14;
        System.out.println(intNumber);

        double doubleNumber = 3.14 + (double) 2; // 실수와 정수를 더하기 위해 정수형을 실수형으로 변환
        System.out.println(doubleNumber);
        // 2) 삼항 연산자, 항상 비교연산자와 함께 쓰인다.
        // true , false 값에 따라 결정되는 무언가! 조건 ? 참 : 거짓
        int a = 1;
        int b = 2;

        boolean c = (a == b) ? true : false; // c는 'a와 b는 같니 ?'가 참을 때 true로, 거짓일 때 false로 저장된다.
        System.out.println(c);

        String s = ( a != b) ? "ㅎ" : "ㅠ"; // a와 b는 같지 않니? "앞"(true 일 때 출력) : "뒤"(false일 때 출력)
        System.out.println(s);

        int d = (a > b) ? a : b; // d는 (a > b)가 참일 때 a로, 거짓일 때 b로 저장된다. a와 b 중 큰 값을 d에 넣는 것과 같음
        System.out.println(d);

        int e = (a > b) ? b : a; //  a와 b 중 작은 값을 e에 넣는 것과 같음
        int f = (a < b) ? a : b; // 위와 같은 의미
        System.out.println(e);
        System.out.println(f);

        // 3) 피연산자가 조건에 명시된 클래스의 객체인지 비교하여 true, false
    }
}
