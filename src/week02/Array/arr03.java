
import java.util.Arrays;

public class arr03 {
    public static void main(String[] args) {
        // 2. Arrays.copyOf() 메서드
        int[] a = { 1, 2, 3, 4 };
        int[] b = Arrays.copyOf(a, a.length); // 배열과 함께 length값도 같이 넣어줍니다.
    }
}
