public class W04 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;
        // 1) 피연산자 중 모두 true면 true
        System.out.println(flag1 && flag2);
        System.out.println(flag2 && flag3);
        System.out.println(flag1 && flag2 && flag3);
        // 2) 피연산자 중 하나라도 true면 true
        System.out.println(flag1 || flag2);
        System.out.println(flag2 || flag3);
        System.out.println(flag1 || flag2 || flag3);
        // 3) 논리 부정 연산자 : ! (not)
        System.out.println(!flag1);
        System.out.println(!flag3);
        System.out.println(!(flag1 = flag2));
    }
}
