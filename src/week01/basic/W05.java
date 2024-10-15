package week02.W01;

public class W05 {
    public static void main(String[] args) {
        // 대입연산자 : 변수를 바로 연산해서 그 자리에서 저장하는(대입하는) 연산자
        // =(기본 대입 연산자), +=. -=, ...(복합 대입 연산자)
        // ++ : += 1 , -- : -= 1
        // 복합 대입 연산자
        int number = 0;
        number++; // number = number + 1;
        System.out.println(number);
        number--; // number = number - 1;
        System.out.println(number);
        System.out.println("---------------------");
        int a = 10;
        int b = 10;
        int c = ++a + b--;  // ++a는 a 앞에 ++가 있고, b--는 b뒤에 --가 있다.
        // ++또는 --를 변수 앞에 쓰면 변수에 +1 또는 -1을 연산한 후에 코드가 진행되고,
        // ++또는 --를 변수 뒤에 쓰면 코드(해당 줄의 코드)가 진행이 완료된 이후에 변수에 +1 또는 -1이 연산된다.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
