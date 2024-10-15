package week02.W01;

public class W08 {
    public static void main(String[] args) {
        // 연산자 우선 순위 : 산술 > 비교 > 논리 > 대입
        int x = 2;
        int y = 7;
        int z = 10;

        boolean result = x < y && y < z;
        System.out.println(result);
        result = x + 10 < y && y < z;
        System.out.println(result);
        result = x + 2 * 2 > y;  // 6 > 7
        System.out.println(result);
        result = (x + 2) * 2 > y; // 8 > 7
        System.out.println(result);
    }
}
