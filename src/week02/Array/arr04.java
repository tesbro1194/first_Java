package week02.W01.Array;

import java.util.Arrays;

public class arr04 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length);

        a[3] = 0;
        System.out.println(a[3]);
        System.out.println(b[3]);
    }
}
